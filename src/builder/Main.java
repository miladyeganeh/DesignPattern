package builder;

public class Main {
    public static void main(String[] args) {
        User person = new User.Builder()
                .setFirstName("Alex")
                .setLastName("Ramsey")
                .setBirthDate("20/10/1986").build();

        System.out.println(person);
    }
}
