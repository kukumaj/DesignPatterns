package Decorator;

import Decorator.interfaces.IceCream;
import Decorator.model.BasicIceCream;
import Decorator.model.ChocolateIceCream;
import Decorator.model.MintIceCream;
import Decorator.model.VanillaIceCream;

public class Main {
    public static void main(String[] args) {
        IceCream basicIceCream = new BasicIceCream();
        System.out.println("Basic Ice-cream cost $" + basicIceCream.cost());
        System.out.println("-----------------------------------");
        //Add Vanilla to the order
        IceCream vanilla = new VanillaIceCream(basicIceCream); //wrapping vanilla
        System.out.println("Adding vanilla - cost is: $" + vanilla.cost() );
        System.out.println("-----------------------------------");
        //Add Mint to the order
        IceCream mint = new MintIceCream(vanilla); //wrapping vanilla
        System.out.println("Adding mint - cost is: $" + mint.cost() );
        System.out.println("-----------------------------------");
        //Adding Chocolate to the order
        IceCream chocolate = new ChocolateIceCream(mint); //wrapping vanilla
        System.out.println("Adding chocolate - cost is: $" + chocolate.cost() );
    }

}
