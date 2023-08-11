package Visitor;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        TaxVisitor taxVisitor = new TaxVisitor();
        DiscountVisitor discountVisitor = new DiscountVisitor();
        Jacket jacket = new Jacket(45,88);
        TShirt tShirt = new TShirt(24,99);
        Shirt shirt = new Shirt(22,77);
        //use our tax calculations
        System.out.println(jacket.accept(taxVisitor));
        System.out.println(tShirt.accept(taxVisitor));
        System.out.println(shirt.accept(taxVisitor));
        System.out.println(jacket.accept(discountVisitor));
        System.out.println(tShirt.accept(discountVisitor));
        System.out.println(shirt.accept(discountVisitor));
    }
}
/*
Jacket final price with tax:
        70.2
        TShirt final price with tax:
        28.32
        Shirt final price with tax:
        24.2
        Jacket final price after discount:
        18.0
        TShirt final price after discount:
        16.8
        Shirt final price after discount:
        17.6*/