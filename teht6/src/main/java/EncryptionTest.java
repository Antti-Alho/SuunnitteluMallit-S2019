
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class EncryptionTest {
    public static void main(String[] args) throws Exception {

        Decrypt decrypt = new Decrypt();
        byte[] ciphertext = decrypt.encrypt("jukka");
        System.out.println(decrypt.tostring(ciphertext));
        System.out.println(decrypt.HexStringToBytes(decrypt.tostring(ciphertext)));
        System.out.println("decrypted value:" + decrypt.decrypt(ciphertext));

    }

}

class Decrypt {
    String key = "ThisIsASecretKey";
    private Key getAesKey() throws Exception {
        return new SecretKeySpec(Arrays.copyOf(key.getBytes("UTF-8"), 16), "AES");
    }

    private Cipher getMutual() throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        return cipher;
    }

    public byte[] encrypt(String pass) throws Exception {
        Cipher cipher = getMutual();
        cipher.init(Cipher.ENCRYPT_MODE, getAesKey());
        byte[] encrypted = cipher.doFinal(pass.getBytes("UTF-8"));
        return encrypted;

    }

    public String decrypt(byte[] encrypted) throws Exception {
        Cipher cipher = getMutual();
        cipher.init(Cipher.DECRYPT_MODE, getAesKey());
        String realPass = new String(cipher.doFinal(encrypted));
        return realPass;
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