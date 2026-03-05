// Anton Zahrai 3157193
// repo: https://github.com/widemus/SD2_LabThree_3157193

import static org.junit.Assert.*;
import org.junit.Test;

public class ShapeTest {

    // Epsilon value for floating point comparisons
    private static final double EPSILON = 0.1;

    // test circle area
    @Test
    public void testCircleArea() {
        Circle circle = new Circle("Circle", 3.5);
        assertEquals(Math.PI * 3.5 * 3.5, circle.area(), EPSILON);
    }

    // test circle perimeter
    @Test
    public void testCirclePerimeter() {
        Circle circle = new Circle("Circle", 3.5);
        assertEquals(2 * Math.PI * 3.5, circle.perimeter(), EPSILON);
    }

    // test rhombus area
    @Test
    public void testRhombusArea() {
        Rhombus rhombus = new Rhombus("Rhombus", 5.0, 6.0, 8.0);
        assertEquals((6.0 * 8.0) / 2, rhombus.area(), EPSILON);
    }

    // Test rhombus perimeter
    @Test
    public void testRhombusPerimeter() {
        Rhombus rhombus = new Rhombus("Rhombus", 5.0, 6.0, 8.0);
        assertEquals(4 * 5.0, rhombus.perimeter(), EPSILON);
    }
}
