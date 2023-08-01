package Factory.model;

public class MozambicanCheeseBurger extends Hamburger {
    public MozambicanCheeseBurger() {
        name = "Mozambican Style Cheese Burger";
        sauce = "Spicy mozambican sauce";
        buns = "Cookie dough buns!";
    }

    @Override
    public void cook() {
        System.out.println("Cooking mozambican style ... ");;
    }
}
