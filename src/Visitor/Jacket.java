package Visitor;

public class Jacket implements Visitable {
    private double price;

    public Jacket(double price, int i) {
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
