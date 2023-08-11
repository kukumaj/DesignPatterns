package Prototype2;
import Prototype2.model.Person;
public class Main {

    public static void main(String[] args) {


        Person person = new Person("James", 45);
        System.out.println("Person 1: " + person);

        Person secondPerson = (Person) person.clone();
        System.out.println("Person copy: " + secondPerson);

        System.out.println(System.identityHashCode(person) + " \n"
                + System.identityHashCode(secondPerson));


        Person bonni = new Person("Bonni", 21);
        System.out.println("Person 1:  " + bonni);

        Person nina = (Person)bonni.clone();
        nina.setName("Nina");
        System.out.println("Person 2: " + nina);


        Dolphin jerrry = new Dolphin("Jerry", 78);
        System.out.println("Dolphin 1: " + jerrry);

        Dolphin sam = (Dolphin)jerrry.clone();
        System.out.println("Dolphin 2: " + sam);
    }
}
//OUTPUT
//Person is created!
//Person 1: Person: James
//Creating Person...
//Person copy: Person: James
//1324119927
//990368553
//Person is created!
//Person 1:  Person: Bonni
//Creating Person...
//Person 2: Person: Nina
//Dolphin 1: This is person named: Jerry
//Dolphin 2: This is person named: Jerry