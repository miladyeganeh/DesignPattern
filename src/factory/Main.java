package factory;

public class Main {
    public static void main(String[] args) {
        Reader reader;
        try {
            reader = Factory.getReader("json");
            reader.readFile();
            System.out.println("Suffix is : " + reader.getSuffix());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
