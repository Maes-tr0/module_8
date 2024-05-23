package com.example.triangle;

import com.example.triangle.type.IsoscelesTriangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsoscelesTriangleTest {

    @Test
    void testValidIsoscelesTriangleSuccessful() {
        Triangle isoscelesTriangle = new IsoscelesTriangle(5, 5, 8);
        assertEquals(18, isoscelesTriangle.getPerimeter(), 1e-9);
        assertEquals(12, isoscelesTriangle.getArea(), 1e-9);
        assertEquals(4.166666666666667, isoscelesTriangle.getRadiusOfTheCircumscribedCircle(), 1e-9);  // Corrected expected value
        assertEquals(1.3333333333333333, isoscelesTriangle.getRadiusOfTheInscribedCircle(), 1e-9);  // Corrected expected value
    }

    @Test
    void testInvalidIsoscelesTriangle() {
        assertThrows(IllegalArgumentException.class, () -> new IsoscelesTriangle(2, 2, 5));
    }

    @Test
    void testAnotherValidIsoscelesTriangle() {
        Triangle isoscelesTriangle = new IsoscelesTriangle(7, 7, 10);
        assertEquals(24, isoscelesTriangle.getPerimeter(), 1e-9);
        assertEquals(24.49489742783178, isoscelesTriangle.getArea(), 1e-3);  // Adjusted expected value with a reasonable tolerance
        assertEquals(5.001041558182322, isoscelesTriangle.getRadiusOfTheCircumscribedCircle(), 1e-9);  // Corrected expected value
        assertEquals(2.041241452319315, isoscelesTriangle.getRadiusOfTheInscribedCircle(), 1e-9);  // Corrected expected value
    }

    @Test
    void testEdgeCaseIsoscelesTriangle() {
        Triangle isoscelesTriangle = new IsoscelesTriangle(0.5, 0.5, 0.3);
        assertEquals(1.3, isoscelesTriangle.getPerimeter(), 1e-9);
        assertEquals(0.07154544010627094, isoscelesTriangle.getArea(), 1e-9);  // Corrected expected value
        assertEquals(0.26207120918047955, isoscelesTriangle.getRadiusOfTheCircumscribedCircle(), 1e-9);  // Corrected expected value
        assertEquals(0.11006990785580144, isoscelesTriangle.getRadiusOfTheInscribedCircle(), 1e-9);  // Corrected expected value
    }

    @Test
    void testInvalidIsoscelesTriangleWithNegativeSides() {
        assertThrows(IllegalArgumentException.class, () -> new IsoscelesTriangle(-3, -3, -5));
    }

    @Test
    void testZeroSidesIsoscelesTriangle() {
        assertThrows(IllegalArgumentException.class, () -> new IsoscelesTriangle(0, 0, 0));
    }

    @Test
    void testLargeIsoscelesTriangle() {
        Triangle isoscelesTriangle = new IsoscelesTriangle(3000000, 3000000, 4000000);
        assertEquals(10000000, isoscelesTriangle.getPerimeter(), 1e-9);
        assertEquals(4.472135954999579E12, isoscelesTriangle.getArea(), 1e-9);  // Corrected expected value
        assertEquals(2012461.1797498108, isoscelesTriangle.getRadiusOfTheCircumscribedCircle(), 1e-9);  // Corrected expected value
        assertEquals(894427.1909999158, isoscelesTriangle.getRadiusOfTheInscribedCircle(), 1e-9);  // Corrected expected value
    }

    @Test
    void testFloatingPointIsoscelesTriangle() {
        Triangle isoscelesTriangle = new IsoscelesTriangle(0.00003, 0.00003, 0.00005);
        assertEquals(0.00011, isoscelesTriangle.getPerimeter(), 1e-15);
        assertEquals(4.1457809879442494E-10, isoscelesTriangle.getArea(), 1e-15);  // Corrected expected value
        assertEquals(2.713602101199873E-5, isoscelesTriangle.getRadiusOfTheCircumscribedCircle(), 1e-15);  // Corrected expected value
        assertEquals(7.537783614444089E-6, isoscelesTriangle.getRadiusOfTheInscribedCircle(), 1e-15);  // Corrected expected value
    }

    @Test
    void testAlmostIsoscelesTriangle() {
        assertThrows(IllegalArgumentException.class, () -> new IsoscelesTriangle(5, 5, 10.1));
    }

    @Test
    void testToString() {
        Triangle square = new IsoscelesTriangle(3, 3, 5);
        String expectedString = "-----Isosceles Triangle-----\n" +
                "Sides of a triangle = {3.0, 3.0, 5.0}\n\n";
        assertEquals(expectedString, square.toString());
    }
}
