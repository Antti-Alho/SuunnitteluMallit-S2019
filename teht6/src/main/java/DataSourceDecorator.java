
import java.util.List;

public class DataSourceDecorator implements DataSource{
    public DataSource ds;
    
    public DataSourceDecorator(DataSource ds){
        this.ds = ds;
    }

    @Override
    public void writeData(List<String> data) {
        ds.writeData(data);
    }

    @Override
    public List<String> readData() {
        return ds.readData();
    }
}
