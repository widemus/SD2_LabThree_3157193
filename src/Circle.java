// Anton Zahrai 3157193
// repo: https://github.com/widemus/SD2_LabThree_3157193

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
        return Math.PI * radius * radius;
    }

    // stub
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", Radius: " + radius;
    }
}