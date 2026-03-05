// Anton Zahrai 3157193
// repo: https://github.com/widemus/SD2_LabThree_3157193

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
        return (base * height) / 2;
    }

    // stub
    @Override
    public double perimeter() {
        double hypotenuse = Math.sqrt(base * base + height * height);
        return base + height + hypotenuse;
    }

    @Override
    public String toString() {
        return super.toString() + ", Base: " + base + ", Height: " + height;
    }
}
