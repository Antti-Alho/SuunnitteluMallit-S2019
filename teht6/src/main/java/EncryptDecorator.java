
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;

import javax.crypto.spec.IvParameterSpec;
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
                String s = "";
                for (byte d : b) {
                    s = s + Byte.toString(d);
                }
                returnData.add(s);
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
        return data;
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
    
    public static byte[] HexStringToBytes(String s){
    String HEX_CHARS = "0123456789ABCDEF";

    if (s.length() == 0) return new byte[0];

    byte[] bytes = new byte[(s.length() + 1) / 3];

    int state = 0;
    int currentByte = 0;
    int x;
    int value = 0;
    char[] c = s.toCharArray();
        for (char d : c) {
            switch (state)
            {
                case 0:
                    x = HEX_CHARS.indexOf(d);
                    value = x << 4;
                    state = 1;
                    break;
                case 1:
                    x = HEX_CHARS.indexOf(d);
                    bytes[currentByte++] = (byte)(value + x);
                    state = 2;
                    break;
                case 2:
                    state = 0;
                    break;
            }
        }

        return bytes;
    }
 
}
