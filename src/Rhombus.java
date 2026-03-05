// Anton Zahrai 3157193
// repo: https://github.com/widemus/SD2_LabThree_3157193

public class Rhombus extends Shape {

    // side
    private double side;

    // diagonal 1
    private double diagonal1;

    // diagonal 2
    private double diagonal2;

    // constructor
    public Rhombus(String name, double side, double diagonal1, double diagonal2) {
        super(name);
        this.side = side;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public double getSide() { return side; }
    public double getDiagonal1() { return diagonal1; }
    public double getDiagonal2() { return diagonal2; }

    // stub
    @Override
    public double area() {
        return (diagonal1 * diagonal2) / 2;
    }

    // stub
    @Override
    public double perimeter() {
        return 0.0;
    }

    @Override
    public String toString() {
        return super.toString() + ", Side: " + side + ", D1: " + diagonal1 + ", D2: " + diagonal2;
    }
}