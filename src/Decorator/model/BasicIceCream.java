package Decorator.model;

import Decorator.interfaces.IceCream;

public class BasicIceCream implements IceCream {

    public BasicIceCream() {
        System.out.println("Create a basic Ice-Cream!");
    }

    @Override
    public double cost() {
        return 0.50;
    }
}
