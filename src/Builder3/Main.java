package Builder3;

public class Main {
    public static void main(String[] args) {
        // Build a vegetarian pizza
        Pizza vegetarianPizza = new PizzaBuilder()
                .crust("Thin")
                .sauce("Tomato")
                .cheese(true)
                .mushrooms(true)
                .build();
        System.out.println("Vegetarian Pizza: " + vegetarianPizza);
        // Build a pepperoni pizza
        Pizza pepperoniPizza = new PizzaBuilder()
                .crust("Pan")
                .sauce("Barbecue")
                .cheese(true)
                .pepperoni(true)
                .mushrooms(false)
                .build();
        System.out.println("Pepperoni Pizza: " + pepperoniPizza);
    }
}