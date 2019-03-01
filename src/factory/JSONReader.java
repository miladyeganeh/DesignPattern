package factory;

public class JSONReader implements Reader {

    @Override
    public void readFile() {
        System.out.println("Read JSON file...");
    }

    @Override
    public String getSuffix() {
        return ".json";
    }
}
