package Visitor;

public interface Visitor {
    double visitor(Shirt shirtItem);

    double visitor(TShirt tShirtItem);

    double visitor(Jacket jacketItem);
}
