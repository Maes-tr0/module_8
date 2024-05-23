package com.example.quadrangle;

import com.example.quadrangle.type.Square;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {

    @Test
    void testValidSquareSuccessful() {
        Square square = new Square(5, 5, 5, 5);
        assertEquals(20, square.getPerimeter(), 1e-9);
        assertEquals(25, square.getArea(), 1e-9);
        assertEquals(2.5, square.getRadiusOfTheInscribedCircle(), 1e-9);
        assertEquals(5 * Math.sqrt(2) / 2, square.getRadiusOfTheCircumscribedCircle(), 1e-9);
    }

    @Test
    void testInvalidSquare() {
        assertThrows(IllegalArgumentException.class, () -> new Square(5, 5, 5, 6));
    }

    @Test
    void testAnotherValidSquare() {
        Square square = new Square(10, 10, 10, 10);
        assertEquals(40, square.getPerimeter(), 1e-9);
        assertEquals(100, square.getArea(), 1e-9);
        assertEquals(5, square.getRadiusOfTheInscribedCircle(), 1e-9);
        assertEquals(10 * Math.sqrt(2) / 2, square.getRadiusOfTheCircumscribedCircle(), 1e-9);
    }

    @Test
    void testEdgeCaseSquare() {
        Square square = new Square(0.3, 0.3, 0.3, 0.3);
        assertEquals(1.2, square.getPerimeter(), 1e-9);
        assertEquals(0.09, square.getArea(), 1e-9);
        assertEquals(0.15, square.getRadiusOfTheInscribedCircle(), 1e-9);
        assertEquals(0.3 * Math.sqrt(2) / 2, square.getRadiusOfTheCircumscribedCircle(), 1e-9);
    }

    @Test
    void testInvalidSquareWithNegativeSides() {
        assertThrows(IllegalArgumentException.class, () -> new Square(-3, -3, -3, -3));
    }

    @Test
    void testZeroSidesSquare() {
        assertThrows(IllegalArgumentException.class, () -> new Square(0, 0, 0, 0));
    }

    @Test
    void testLargeSquare() {
        Square square = new Square(3000000, 3000000, 3000000, 3000000);
        assertEquals(12000000, square.getPerimeter(), 1e-9);
        assertEquals(9e12, square.getArea(), 1e-9);
        assertEquals(1500000, square.getRadiusOfTheInscribedCircle(), 1e-9);
        assertEquals(3000000 * Math.sqrt(2) / 2, square.getRadiusOfTheCircumscribedCircle(), 1e-9);
    }

    @Test
    void testFloatingPointSquare() {
        Square square = new Square(0.00003, 0.00003, 0.00003, 0.00003);
        assertEquals(0.00012, square.getPerimeter(), 1e-15);
        assertEquals(9e-10, square.getArea(), 1e-15);
        assertEquals(0.000015, square.getRadiusOfTheInscribedCircle(), 1e-15);
        assertEquals(0.00003 * Math.sqrt(2) / 2, square.getRadiusOfTheCircumscribedCircle(), 1e-15);
    }

    @Test
    void testAlmostSquare() {
        assertThrows(IllegalArgumentException.class, () -> new Square(3, 3, 3, 3.1));
    }

    @Test
    void testToString() {
        Square square = new Square(4, 4, 4, 4);
        String expectedString = "-----Square----\n" +
                "Sides of a quadrilateral = {4.0, 4.0, 4.0, 4.0}\n" +
                "Angle of a quadrilateral = {90.0, 90.0, 90.0, 90.0}\n\n";
        assertEquals(expectedString, square.toString());
    }
}
