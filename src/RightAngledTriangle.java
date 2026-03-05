// Anton Zahrai 3157193

public class RightAngledTriangle extends Shape {

    private double base;
    private double height;

    // constructor
    public RightAngledTriangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    // getter for base
    public double getBase() {
        return base;
    }

    // getter for height
    public double getHeight() {
        return height;
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
        return super.toString() + ", Base: " + base + ", Height: " + height;
    }
}
