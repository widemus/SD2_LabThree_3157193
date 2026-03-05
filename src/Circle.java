// Anton Zahrai 3157193

public class Circle extends Shape {

    // radius
    private double radius;

    // constructor
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    // getter for radius
    public double getRadius() {
        return radius;
    }

    // setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // stub
    @Override
    public double area() {
        return 0.0;
    }

    // stub
    @Override
    public double perimeter() {
        return 0.0;
    }

    @Override
    public String toString() {
        return super.toString() + ", Radius: " + radius;
    }
}