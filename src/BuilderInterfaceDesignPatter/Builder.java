package BuilderInterfaceDesignPatter;

class Builder extends DefaultPerson {

    public Builder(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Builder phone(String phone) {
        this.phoneNumber = phone;
        return this;
    }

    public Builder address(String address) {
        this.address = address;
        return this;
    }

    public Builder age(int age) {
        this.age = age;
        return this;
    }

    public Person build() {
        return  new DefaultPerson(this);
    }
}
