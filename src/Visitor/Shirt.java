package Visitor;

public class Shirt implements Visitable {
    private double price;

    public Shirt(double price, int i) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visitor(this);
    }
}
