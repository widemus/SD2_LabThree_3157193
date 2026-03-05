// Anton Zahrai 3157193
// repo: https://github.com/widemus/SD2_LabThree_3157193

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class ShapeIntegrationTest {
    private static final double EPSILON = 0.1;

    @Test
    public void testShapesList() {
        // arraylist to hold all shapes
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle("Circle", 3.5));
        shapes.add(new Circle("Circle", 7.0));

        shapes.add(new Rhombus("Rhombus", 5.0, 6.0, 8.0));
        shapes.add(new Rhombus("Rhombus", 4.0, 3.0, 5.0));

        shapes.add(new RightAngledTriangle("Triangle", 3.0, 4.0));
        shapes.add(new RightAngledTriangle("Triangle", 5.0, 12.0));

        // expected area values
        double[] expectedAreas = {
                Math.PI * 3.5 * 3.5,   // Circle 1
                Math.PI * 7.0 * 7.0,   // Circle 2
                (6.0 * 8.0) / 2,       // Rhombus 1
                (3.0 * 5.0) / 2,       // Rhombus 2
                (3.0 * 4.0) / 2,       // Triangle 1
                (5.0 * 12.0) / 2       // Triangle 2
        };

        // expected perimeter values
        double[] expectedPerimeters = {
                2 * Math.PI * 3.5,                              // Circle 1
                2 * Math.PI * 7.0,                              // Circle 2
                4 * 5.0,                                        // Rhombus 1
                4 * 4.0,                                        // Rhombus 2
                3.0 + 4.0 + Math.sqrt(3.0*3.0 + 4.0*4.0),     // Triangle 1
                5.0 + 12.0 + Math.sqrt(5.0*5.0 + 12.0*12.0)   // Triangle 2
        };

        // loop through all shapes and test area and perimeter
        for (int i = 0; i < shapes.size(); i++) {
            assertEquals(expectedAreas[i], shapes.get(i).area(), EPSILON);
            assertEquals(expectedPerimeters[i], shapes.get(i).perimeter(), EPSILON);
        }
    }
}
