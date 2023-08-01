package Factory;

import Factory.interfaces.HamburgerStore;
import Factory.model.Hamburger;
import Factory.model.JamHamburgerStore;
import Factory.model.MozHamburgerStore;

public class Main {
    public static void main(String[] args) {
        HamburgerStore mozambicanBurgerStore = new MozHamburgerStore();
        HamburgerStore jamaicanBurgerStore = new JamHamburgerStore();
        Hamburger hamburger = mozambicanBurgerStore.orderHamburger("cheese");
        System.out.println("Paulo ordered " +hamburger.getName() + " \n");
        hamburger = jamaicanBurgerStore.orderHamburger("veggie");
        System.out.println("James Bond ordered: "+hamburger.getName() + " \n");

    }
}
