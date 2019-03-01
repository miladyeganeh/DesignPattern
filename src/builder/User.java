package builder;

public class User {
    private String firstName;
    private String lastName;
    private String birthDate;

    private User(Builder p) {
        this.firstName = p.firstName;
        this.lastName = p.lastName;
        this.birthDate = p.birthDate;
    }

    static class Builder {
        private String firstName;
        private String lastName;
        private String birthDate;

        Builder() {
        }

        Builder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        Builder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        Builder setBirthDate(String birthDate){
            this.birthDate = birthDate;
            return this;
        }

        User build(){
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}
