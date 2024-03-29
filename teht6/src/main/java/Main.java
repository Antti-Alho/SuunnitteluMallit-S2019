
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {

        Scanner sc = new Scanner(System.in);

        DataSource dstyham = new DataSourceDecorator(new FileDataSource("text.txt"));
        DataSource ds = new EncryptDecorator(dstyham);
        
        while (true) {
            System.out.println("Haluatko salata tiedoston vai lukea salatun tiedoston sisällön?");
            System.out.println("1: salaa");
            System.out.println("2: lue");
            String input = sc.nextLine();
            if (input.equals("1")) {
                System.out.println("tiedoston nimi text.txt");
                List<String> data = new ArrayList<>();
                System.out.println("Mitä Kirjoitetaan? 0 lopettaa syötön");
                while (!input.equals("0")) {
                    input = sc.nextLine();
                    data.add(input);
                }
                ds.writeData(data);
            } else if(input.equals("2")) {
                System.out.println("Luetaan tiedostosta: tiedoston nimi text.txt");
                List<String> output = ds.readData();
                List<String> arg = dstyham.readData();
                
                System.out.println("luetaan raakana:");
                arg.forEach((string) -> {
                    System.out.println(string);
                });
                
                System.err.println("luetaan decryptattuna:");
                output.forEach((string) -> {
                    System.out.println(string);
                });
            } else {
                System.out.println("ei ymmärrä");
            }
        }
    }
}
