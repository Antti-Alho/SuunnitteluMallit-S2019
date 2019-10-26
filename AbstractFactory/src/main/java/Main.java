
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        String factoryName = "";
        
        while (!factoryName.equals("0")) {
        
        System.out.println("oletko Adidas opiskelija vai Boss boss?");
        System.out.println("Kirjoita tehtaan nimi mistä haluat vaatteet AdidasFactory tai BossFactory:");
        System.out.println("0 = exit");
        System.out.println("----------------------");
        System.out.print(":");
        Scanner s = new Scanner(System.in);
        factoryName = s.nextLine();
        Jasper jasper = new Jasper();
        
        AbstractFactory af;
        try {
            af = (AbstractFactory) Class.forName(factoryName).getConstructor().newInstance();
            jasper.setHat(af.createHat());
            jasper.setPants(af.createPants());
            jasper.setShirt(af.createShirt());
            jasper.setShoes(af.createShoes());
        } catch (
            InvocationTargetException |
            InstantiationException |
            IllegalAccessException |
            IllegalArgumentException |
            NoSuchMethodException |
            SecurityException |
            ClassNotFoundException ex
        ) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(jasper);
        
        }

    }
}
