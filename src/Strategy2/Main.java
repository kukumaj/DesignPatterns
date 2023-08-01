package Strategy2;

import Strategy2.controller.CreditCardAlgorithm;
import Strategy2.controller.PaypalAlgorithm;
import Strategy2.controller.ShoppingCart;
import Strategy2.model.Product;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Product pants  = new Product("234", 25);
        Product shirt  = new Product("235", 15);

        cart.addProduct(pants);
        cart.addProduct(shirt);

        //payment decisions
        cart.pay(new PaypalAlgorithm("ryszard@wp.pl", "password1"));
        cart.pay(new CreditCardAlgorithm("Rokoloko","123456"));

    }
}
