package factory;

public class XMLReader implements Reader {
    @Override
    public void readFile() {
        System.out.println("Read XML file...");
    }

    @Override
    public String getSuffix() {
        return ".xml";
    }
}
