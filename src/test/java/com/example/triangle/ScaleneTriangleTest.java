package com.example.triangle;

import com.example.triangle.type.RightTriangle;
import com.example.triangle.type.ScaleneTriangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScaleneTriangleTest {

    @Test
    void testValidScaleneTriangleSuccessful() {
        Triangle scaleneTriangle = new ScaleneTriangle(5, 7, 10);
        assertEquals(22, scaleneTriangle.getPerimeter(), 1e-9);
        assertEquals(16.24807680927192, scaleneTriangle.getArea(), 1e-9);
        assertEquals(5.385252, scaleneTriangle.getRadiusOfTheCircumscribedCircle(), 1e-6);
        assertEquals(1.477097, scaleneTriangle.getRadiusOfTheInscribedCircle(), 1e-6);
    }

    @Test
    void testInvalidScaleneTriangle() {
        assertThrows(IllegalArgumentException.class, () -> new ScaleneTriangle(2, 2, 5));
    }

    @Test
    void testAnotherValidScaleneTriangle() {
        Triangle scaleneTriangle = new ScaleneTriangle(6, 8, 10);
        assertEquals(24, scaleneTriangle.getPerimeter(), 1e-9);
        assertEquals(24, scaleneTriangle.getArea(), 1e-9);
        assertEquals(5, scaleneTriangle.getRadiusOfTheCircumscribedCircle(), 1e-9);
        assertEquals(2, scaleneTriangle.getRadiusOfTheInscribedCircle(), 1e-9);
    }

    @Test
    void testEdgeCaseScaleneTriangle() {
        Triangle scaleneTriangle = new ScaleneTriangle(0.3, 0.4, 0.5);
        assertEquals(1.2, scaleneTriangle.getPerimeter(), 1e-9);
        assertEquals(0.06, scaleneTriangle.getArea(), 1e-9);
        assertEquals(0.25, scaleneTriangle.getRadiusOfTheCircumscribedCircle(), 1e-9);
        assertEquals(0.1, scaleneTriangle.getRadiusOfTheInscribedCircle(), 1e-9);
    }

    @Test
    void testInvalidScaleneTriangleWithNegativeSides() {
        assertThrows(IllegalArgumentException.class, () -> new ScaleneTriangle(-3, -4, -5));
    }

    @Test
    void testZeroSidesScaleneTriangle() {
        assertThrows(IllegalArgumentException.class, () -> new ScaleneTriangle(0, 0, 0));
    }

    @Test
    void testLargeScaleneTriangle() {
        // Тест для великого скаленового трикутника
        Triangle scaleneTriangle = new ScaleneTriangle(3000000, 4000000, 5000000);
        assertEquals(12000000, scaleneTriangle.getPerimeter(), 1e-9);
        assertEquals(6000000000000.0, scaleneTriangle.getArea(), 1e-9);
        assertEquals(2500000.0, scaleneTriangle.getRadiusOfTheCircumscribedCircle(), 1e-9);
        assertEquals(1000000.0, scaleneTriangle.getRadiusOfTheInscribedCircle(), 1e-9);
    }

    @Test
    void testFloatingPointScaleneTriangle() {
        // Тест для трикутника з плаваючою точкою
        Triangle scaleneTriangle = new ScaleneTriangle(0.00003, 0.00004, 0.00005);
        assertEquals(0.00012, scaleneTriangle.getPerimeter(), 1e-15);
        assertEquals(6.0e-10, scaleneTriangle.getArea(), 1e-15);
        assertEquals(2.5e-05, scaleneTriangle.getRadiusOfTheCircumscribedCircle(), 1e-15);
        assertEquals(1.0e-05, scaleneTriangle.getRadiusOfTheInscribedCircle(), 1e-15);
    }

    @Test
    void testToString() {
        Triangle square = new ScaleneTriangle(3, 4, 5);
        String expectedString = "-----Scalene Triangle-----\n" +
                "Sides of a triangle = {3.0, 4.0, 5.0}\n\n";
        assertEquals(expectedString, square.toString());
    }
}
