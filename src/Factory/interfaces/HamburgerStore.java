package Factory.interfaces;

import Factory.model.Hamburger;

public abstract class HamburgerStore {

    public Hamburger orderHamburger(String type) {
        Hamburger burger;
        burger = createHamburger(type);//factory.createHamburger(type);
        burger.prepare();
        burger.cook();
        burger.box();
        return burger;
    }

    abstract public Hamburger createHamburger(String type);

}
