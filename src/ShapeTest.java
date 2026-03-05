// Anton Zahrai 3157193
// repo: https://github.com/widemus/SD2_LabThree_3157193

import static org.junit.Assert.*;
import org.junit.Test;

public class ShapeTest {

    // Epsilon value for floating point comparisons
    private static final double EPSILON = 0.1;

    // test area
    @Test
    public void testCircleArea() {
        Circle circle = new Circle("Circle", 3.5);
        assertEquals(Math.PI * 3.5 * 3.5, circle.area(), EPSILON);
    }
}
