package com.example.triangle;

import com.example.triangle.type.EquilateralTriangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EquilateralTriangleTest {

    @Test
    void testValidEquilateralTriangleSuccessful() {
        Triangle equilateralTriangle = new EquilateralTriangle(5, 5, 5);
        assertEquals(15, equilateralTriangle.getPerimeter(), 1e-9);
        assertEquals(10.825317547305486, equilateralTriangle.getArea(), 1e-9);
        assertEquals(2.886751345948129, equilateralTriangle.getRadiusOfTheCircumscribedCircle(), 1e-9);
        assertEquals(1.4433756729740643, equilateralTriangle.getRadiusOfTheInscribedCircle(), 1e-9);
    }

    @Test
    void testInvalidEquilateralTriangle() {
        assertThrows(IllegalArgumentException.class, () -> new EquilateralTriangle(2, 2, 5));
    }

    @Test
    void testAnotherValidEquilateralTriangle() {
        Triangle equilateralTriangle = new EquilateralTriangle(10, 10, 10);
        assertEquals(30, equilateralTriangle.getPerimeter(), 1e-9);
        assertEquals(43.30127018922193, equilateralTriangle.getArea(), 1e-9);
        assertEquals(5.773502691896258, equilateralTriangle.getRadiusOfTheCircumscribedCircle(), 1e-9);
        assertEquals(2.886751345948129, equilateralTriangle.getRadiusOfTheInscribedCircle(), 1e-9);
    }

    @Test
    void testEdgeCaseEquilateralTriangle() {
        Triangle equilateralTriangle = new EquilateralTriangle(0.5, 0.5, 0.5);
        assertEquals(1.5, equilateralTriangle.getPerimeter(), 1e-9);
        assertEquals(0.10825317547305486, equilateralTriangle.getArea(), 1e-9);
        assertEquals(0.2886751345948129, equilateralTriangle.getRadiusOfTheCircumscribedCircle(), 1e-9);
        assertEquals(0.14433756729740643, equilateralTriangle.getRadiusOfTheInscribedCircle(), 1e-9);
    }

    @Test
    void testInvalidEquilateralTriangleWithNegativeSides() {
        assertThrows(IllegalArgumentException.class, () -> new EquilateralTriangle(-3, -3, -3));
    }

    @Test
    void testZeroSidesEquilateralTriangle() {
        assertThrows(IllegalArgumentException.class, () -> new EquilateralTriangle(0, 0, 0));
    }

    @Test
    void testLargeEquilateralTriangle() {
        // Тест для великого рівностороннього трикутника
        Triangle equilateralTriangle = new EquilateralTriangle(3000000, 3000000, 3000000);
        assertEquals(9000000, equilateralTriangle.getPerimeter(), 1e-9);
        assertEquals(3897114317029.974, equilateralTriangle.getArea(), 1e-9);
        assertEquals(1732050.8075688772, equilateralTriangle.getRadiusOfTheCircumscribedCircle(), 1e-9);
        assertEquals(866025.4037844386, equilateralTriangle.getRadiusOfTheInscribedCircle(), 1e-9);
    }

    @Test
    void testFloatingPointEquilateralTriangle() {
        // Тест для трикутника з плаваючою точкою
        Triangle equilateralTriangle = new EquilateralTriangle(0.00003, 0.00003, 0.00003);
        assertEquals(0.00009, equilateralTriangle.getPerimeter(), 1e-15);
        assertEquals(3.89711431702931e-10, equilateralTriangle.getArea(), 1e-15);
        assertEquals(1.732050807568877e-05, equilateralTriangle.getRadiusOfTheCircumscribedCircle(), 1e-15);
        assertEquals(8.660254037844387e-06, equilateralTriangle.getRadiusOfTheInscribedCircle(), 1e-15);
    }

    @Test
    void testAlmostEquilateralTriangle() {
        // Тест для трикутника, який майже є рівностороннім, але не є ним
        assertThrows(IllegalArgumentException.class, () -> new EquilateralTriangle(5, 5, 5.1));
    }

    @Test
    void testToString() {
        Triangle square = new EquilateralTriangle(3, 3, 3);
        String expectedString = "-----Equilateral Triangle-----\n" +
                "Sides of a triangle = {3.0, 3.0, 3.0}\n\n";
        assertEquals(expectedString, square.toString());
    }
}
