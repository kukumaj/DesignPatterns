package BuilderPattern;

public class User  {

    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;
    private String address;

    public User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return "Name: " + this.firstName + " " + this.lastName + "\n" +
                 "Age: " + this.age +
                " Phone: " + this.phoneNumber +
                " Address: " + this.address;

    }


}
