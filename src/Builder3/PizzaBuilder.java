package Builder3;

public class PizzaBuilder {
    private Pizza pizza;

    public PizzaBuilder() {
        pizza = new Pizza();
    }

    public PizzaBuilder crust(String crust) {
        pizza.setCrust(crust);
        return this;
    }

    public PizzaBuilder sauce(String sauce) {
        pizza.setSauce(sauce);
        return this;
    }

    public PizzaBuilder cheese(boolean cheese) {
        pizza.setCheese(cheese);
        return this;
    }

    public PizzaBuilder pepperoni(boolean pepperoni) {
        pizza.setPepperoni(pepperoni);
        return this;
    }

    public PizzaBuilder mushrooms(boolean mushrooms) {
        pizza.setMushrooms(mushrooms);
        return this;
    }

    public Pizza build() {
        return pizza;
    }
}