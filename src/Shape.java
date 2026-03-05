// Anton Zahrai 3157193
// repo: https://github.com/widemus/SD2_LabThree_3157193

public abstract class Shape {

    // name of the shape
    private String name;

    // constructor
    public Shape(String name) {
        this.name = name;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // calculate area
    public abstract double area();

    // calculate perimeter
    public abstract double perimeter();

    @Override
    public String toString() {
        return "shape: " + name;
    }
}