package com.example.triangle;

import com.example.quadrangle.type.Square;
import com.example.triangle.type.RightTriangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RightTriangleTest {

    @Test
    void testValidRightTriangleSuccessful() {
        Triangle rightTriangle = new RightTriangle(3, 4, 5);
        assertEquals(12, rightTriangle.getPerimeter(), 1e-9);
        assertEquals(6, rightTriangle.getArea(), 1e-9);
        assertEquals(2.5, rightTriangle.getRadiusOfTheCircumscribedCircle(), 1e-9);
        assertEquals(1, rightTriangle.getRadiusOfTheInscribedCircle(), 1e-9);
    }

    @Test
    void testInvalidRightTriangle() {
        assertThrows(IllegalArgumentException.class, () -> new RightTriangle(2, 4, 4));
    }

    @Test
    void testAnotherValidRightTriangle() {
        Triangle rightTriangle = new RightTriangle(5, 12, 13);
        assertEquals(30, rightTriangle.getPerimeter(), 1e-9);
        assertEquals(30, rightTriangle.getArea(), 1e-9);
        assertEquals(6.5, rightTriangle.getRadiusOfTheCircumscribedCircle(), 1e-9);
        assertEquals(2, rightTriangle.getRadiusOfTheInscribedCircle(), 1e-9);
    }

    @Test
    void testEdgeCaseRightTriangle() {
        Triangle rightTriangle = new RightTriangle(0.3, 0.4, 0.5);
        assertEquals(1.2, rightTriangle.getPerimeter(), 1e-9);
        assertEquals(0.06, rightTriangle.getArea(), 1e-9);
        assertEquals(0.25, rightTriangle.getRadiusOfTheCircumscribedCircle(), 1e-9);
        assertEquals(0.1, rightTriangle.getRadiusOfTheInscribedCircle(), 1e-9);
    }

    @Test
    void testInvalidRightTriangleWithNegativeSides() {
        assertThrows(IllegalArgumentException.class, () -> new RightTriangle(-3, -4, -5));
    }

    @Test
    void testZeroSidesRightTriangle() {
        assertThrows(IllegalArgumentException.class, () -> new RightTriangle(0, 0, 0));
    }

    @Test
    void testLargeRightTriangle() {
        // Тест для великого прямокутного трикутника
        Triangle rightTriangle = new RightTriangle(3000000, 4000000, 5000000);
        assertEquals(12000000, rightTriangle.getPerimeter(), 1e-9);
        assertEquals(6000000000000.0, rightTriangle.getArea(), 1e-9);
        assertEquals(2500000.0, rightTriangle.getRadiusOfTheCircumscribedCircle(), 1e-9);
        assertEquals(1000000.0, rightTriangle.getRadiusOfTheInscribedCircle(), 1e-9);
    }

    @Test
    void testFloatingPointRightTriangle() {
        // Тест для трикутника з плаваючою точкою
        Triangle rightTriangle = new RightTriangle(0.00003, 0.00004, 0.00005);
        assertEquals(0.00012, rightTriangle.getPerimeter(), 1e-15);
        assertEquals(6.0e-10, rightTriangle.getArea(), 1e-15);
        assertEquals(2.5e-05, rightTriangle.getRadiusOfTheCircumscribedCircle(), 1e-15);
        assertEquals(1.0e-05, rightTriangle.getRadiusOfTheInscribedCircle(), 1e-15);
    }

    @Test
    void testAlmostRightTriangle() {
        // Тест для трикутника, який майже є прямокутним, але не є ним
        assertThrows(IllegalArgumentException.class, () -> new RightTriangle(3, 4, 5.1));
    }

    @Test
    void testToString() {
        Triangle square = new RightTriangle(3, 4, 5);
        String expectedString = "-----Right-angled Triangle-----\n" +
                "Sides of a triangle = {3.0, 4.0, 5.0}\n\n";
        assertEquals(expectedString, square.toString());
    }
}
