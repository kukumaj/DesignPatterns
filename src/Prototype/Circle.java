package Prototype;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this.radius);
    }

    @Override
    public String getInfo() {
        return "Circle with radius: " + radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
}