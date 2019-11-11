
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(new File("").getAbsolutePath() + "/src/main/java/factory.properties"));
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        String factoryNameA = properties.getProperty("factorya");
        String factoryNameB = properties.getProperty("factoryb");
        
        Jasper jasper = new Jasper();
        Jasper jesper = new Jasper();
        
        
        AbstractFactory afa;
        AbstractFactory afb;
        try {
            afa = (AbstractFactory) Class.forName(factoryNameA).getConstructor().newInstance();
            afb = (AbstractFactory) Class.forName(factoryNameB).getConstructor().newInstance();
            jasper.setHat(afa.createHat());
            jasper.setPants(afa.createPants());
            jasper.setShirt(afa.createShirt());
            jasper.setShoes(afa.createShoes());
            
            jesper.setHat(afb.createHat());
            jesper.setPants(afb.createPants());
            jesper.setShirt(afb.createShirt());
            jesper.setShoes(afb.createShoes());
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
        System.out.println("-----------");
        System.out.println(jesper);
    }
}

