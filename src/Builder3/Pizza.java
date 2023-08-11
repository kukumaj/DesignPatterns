package Builder3;

public class Pizza {
    private String crust;
    private String sauce;
    private boolean cheese;
    private boolean pepperoni;
    private boolean mushrooms;
    // Other properties and methods as needed

    public Pizza() {
        // Default constructor
    }

    // Setter methods for properties
    public void setCrust(String crust) {
        this.crust = crust;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public void setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
    }

    public void setMushrooms(boolean mushrooms) {
        this.mushrooms = mushrooms;
    }

    // Other methods
    @Override
    public String toString() {
        return "Pizza with " + crust + " crust, " + sauce + " sauce" +
                (cheese ? ", cheese" : "")  +
                (pepperoni ? ", pepperoni" : "")  +
                (mushrooms ? ", mushrooms" : "");
    }
}