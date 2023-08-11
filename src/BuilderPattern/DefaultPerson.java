package BuilderPattern;

public class DefaultPerson implements Person {

    // Required parameters
    String firstName;
    String lastName;

    // Optional parameters
    String phoneNumber;
    String address;
    int age;

    public DefaultPerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected DefaultPerson(Builder builder) {

        this(builder.getFirstName(), builder.getLastName(), builder.getAddress(), builder.getAge(), builder.getPhoneNumber());
        // second alternative below
//        this.firstName = builder.getFirstName();
//        this.lastName = builder.getLastName();
//        this.phoneNumber = builder.getPhoneNumber();
//        this.address = builder.getAddress();
//        this.age = builder.getAge();
    }

    public DefaultPerson(String firstName, String lastName, String address, int age, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: " + this.firstName +
                " " + this.lastName);
        stringBuilder.append("Phone: " + this.phoneNumber + " ");
        stringBuilder.append("Age: " + this.age + " ");
        stringBuilder.append("Address: " + this.address + " ");

        return stringBuilder.toString();
    }
}