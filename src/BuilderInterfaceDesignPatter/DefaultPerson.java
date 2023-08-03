package BuilderInterfaceDesignPatter;

class DefaultPerson implements Person {

    // Required parameters
    private final String firstName;
    private final String lastName;


    // Optional parameters
    protected String phoneNumber;
    protected String address;
    protected int age;

    public DefaultPerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected DefaultPerson(Builder builder) {

        this(builder.getFirstName(), builder.getLastName());
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
        this.age = builder.age;
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
    public String getAddress() {
        return this.address;
    }


    @Override
    public int getAge() {
        return this.age;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: " + this.firstName +
                " " + this.lastName + " ");
        stringBuilder.append("Phone: " + this.phoneNumber + " ");
        stringBuilder.append("Age: " + this.age + " ");
        stringBuilder.append("Address: " + this.address);

        return stringBuilder.toString();
    }
}