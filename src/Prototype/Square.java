package Prototype;

public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public Shape clone() {
        return new Square(this.side);
    }

    @Override
    public String getInfo() {
        return "Square with side: " + side;
    }
}
