
import java.security.GeneralSecurityException;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;

import javax.crypto.spec.SecretKeySpec;


public class EncryptDecorator extends DataSourceDecorator{
    
    String key;
    Cipher c;
    
    public EncryptDecorator(DataSource ds) {
        super(ds);
        key = "ThisIsASecretKey";
    }
    
    @Override
    public void writeData(List<String> data){
        List<String> returnData = new ArrayList<>();
        for (String string : data) {
            try {
                byte[] b = encrypt(string);
                returnData.add(tostring(b));
            } catch (GeneralSecurityException ex) {
                Logger.getLogger(EncryptDecorator.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(EncryptDecorator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        super.writeData(returnData);
    };
    
    @Override
    public List<String> readData(){
        List<String> data = super.readData();
        List<String> newdata = new ArrayList<>();
        for (String string : data) {
            try {
                newdata.add(decrypt(HexStringToBytes(string)));
            } catch (GeneralSecurityException ex) {
                Logger.getLogger(EncryptDecorator.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(EncryptDecorator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return newdata;
    }
    
    public byte[] encrypt(String value) throws GeneralSecurityException, Exception {
        Cipher cipher = getMutual();
        cipher.init(Cipher.ENCRYPT_MODE, getAesKey());
        byte[] encrypted = cipher.doFinal(value.getBytes("UTF-8"));
        return encrypted;
    }

    public String decrypt(byte[] encrypted) throws GeneralSecurityException, Exception {
        Cipher cipher = getMutual();
        cipher.init(Cipher.DECRYPT_MODE, getAesKey());
        String realPass = new String(cipher.doFinal(encrypted));
        return realPass;
    }
    
    private Cipher getMutual() throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        return cipher;
    }
    
    private Key getAesKey() throws Exception {
        return new SecretKeySpec(Arrays.copyOf(key.getBytes("UTF-8"), 16), "AES");
    }
    
    public String tostring(byte[] b){
        String s = "";
        for (byte d : b) {
            s = s  + Byte.toString(d) +" ";
        }
        return s;
    }
   
    public static byte[] HexStringToBytes(String s){
        String[] split = s.split(" ");
        byte[] encrypted = new byte[split.length];
        for (int i = 0; i < split.length; i++) {
            encrypted[i] = Byte.parseByte(split[i], 10);
        }
        return encrypted;
    } 
 
}
