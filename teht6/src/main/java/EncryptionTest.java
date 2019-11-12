
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class EncryptionTest {
    public static void main(String[] args) throws Exception {

        Decrypt decrypt = new Decrypt();
        byte[] ciphertext = decrypt.encrypt("jukka");
        String s = decrypt.tostring(ciphertext);
        byte[] b = decrypt.HexStringToBytes(s);
        System.out.println(ciphertext);
        System.out.println(b);
        System.out.println("decrypted value:" + decrypt.decrypt(b));

    }

}

class Decrypt {
    String key = "ThisIsASecretKey";
    private Key getAesKey() throws Exception {
        return new SecretKeySpec(Arrays.copyOf(key.getBytes("UTF-8"), 16), "AES");
    }

    private Cipher getMutual() throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        return cipher;// cipher.doFinal(pass.getBytes());
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
            s = s + d;
        }
        return s;
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