
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileDataSource implements DataSource{

    private final String file;
    
    public FileDataSource(String file){
        this.file = file;
    }

    @Override
    public void writeData(List<String> data) {
        try (PrintWriter pr = new PrintWriter(this.file)) {
            data.forEach((string) -> {
                pr.println(string);
            });
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileDataSource.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Kirjoitettu");
    }

    @Override
    public List<String> readData() {
        List<String> lines = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(this.file));
            String line;
            while((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();
        } catch (FileNotFoundException ex ) {
            Logger.getLogger(FileDataSource.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileDataSource.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lines;
    }
    
}
