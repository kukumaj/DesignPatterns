package Visitor;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {

    DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public TaxVisitor() {

    }

    @Override
    public double visitor(Shirt shirtItem) {
        System.out.println("Shirt final price with tax: ");
        return Double.parseDouble(decimalFormat.format(shirtItem.getPrice()*.10 + shirtItem.getPrice()));
    }

    @Override
    public double visitor(TShirt tShirtItem) {
        System.out.println("TShirt final price with tax: ");
        return Double.parseDouble(decimalFormat.format(tShirtItem.getPrice()*.18 + tShirtItem.getPrice()));
    }

    @Override
    public double visitor(Jacket jacketItem) {
        System.out.println("Jacket final price with tax: ");
        return Double.parseDouble(decimalFormat.format(jacketItem.getPrice()*0.56 + jacketItem.getPrice()));
    }
}
