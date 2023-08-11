package Visitor;

import java.text.DecimalFormat;

public class DiscountVisitor implements Visitor {

    DecimalFormat decimalFormat = new DecimalFormat("#,##");

    public DiscountVisitor() {
    }

    @Override
    public double visitor(Shirt shirtItem) {
        System.out.println("Shirt final price after discount: ");
        return Double.parseDouble(decimalFormat.format( + shirtItem.getPrice() - shirtItem.getPrice()*.2));
    }

    @Override
    public double visitor(TShirt tShirtItem) {
        System.out.println("TShirt final price after discount: ");
        return Double.parseDouble(decimalFormat.format( + tShirtItem.getPrice() - tShirtItem.getPrice()*.3));
    }

    @Override
    public double visitor(Jacket jacketItem) {
        System.out.println("Jacket final price after discount: ");
        return Double.parseDouble(decimalFormat.format( + jacketItem.getPrice() - jacketItem.getPrice()*.6));
    }
}
