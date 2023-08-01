package Singleton;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person();
//        Person secondPerson = new Person();
        MyClass myClass = MyClass.getInstance();
        MyClass secondClass = MyClass.getInstance();
        myClass.name = "Class";
        System.out.println(myClass);

//        System.out.println("Second instance " + secondClass);
//        System.out.println("Object person: " + person);
//        System.out.println("Second Object person: " + secondPerson);
    }
}
