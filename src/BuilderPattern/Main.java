package BuilderPattern;
public class Main {
    public static void main(String[] args) {
        //An example of a Java Library class that uses the Builder Design Patterns
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("Hello World")
//                .append("I don't know")
//                .append("This is the end");

       // System.out.println(stringBuilder);
       User James = new UserBuilder("James", "Bond")
               .phoneNumber("007")
               .age(33)
               .address(" some uknown adress :)")
               .build();
        System.out.println(James);
        Person tallPerson = new Builder("James", "Arriola ")
                .phone("666666666")
                .address("some adress")
                .age(88)
                .build();
        System.out.println(tallPerson);
    }
}
