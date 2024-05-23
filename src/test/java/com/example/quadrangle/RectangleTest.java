package com.example.quadrangle;

import com.example.quadrangle.type.Rectangle;
import com.example.quadrangle.type.Square;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    void testValidRectangleSuccessful() {
        Quadrangle rectangle = new Rectangle(4, 6, 4, 6);
        assertEquals(20, rectangle.getPerimeter(), 1e-9);
        assertEquals(24, rectangle.getArea(), 1e-9);
        assertThrows(IllegalArgumentException.class, rectangle::getRadiusOfTheCircumscribedCircle);
        assertThrows(IllegalArgumentException.class, rectangle::getRadiusOfTheInscribedCircle);
    }

    @Test
    void testInvalidRectangle() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(2, 2, 2, 4));
    }

    @Test
    void testAnotherValidRectangle() {
        Quadrangle rectangle = new Rectangle(10, 15, 10, 15);
        assertEquals(50, rectangle.getPerimeter(), 1e-9);
        assertEquals(150, rectangle.getArea(), 1e-9);
        assertThrows(IllegalArgumentException.class, rectangle::getRadiusOfTheCircumscribedCircle);
        assertThrows(IllegalArgumentException.class, rectangle::getRadiusOfTheInscribedCircle);
    }

    @Test
    void testEdgeCaseRectangle() {
        Quadrangle rectangle = new Rectangle(0.3, 0.4, 0.3, 0.4);
        assertEquals(1.4, rectangle.getPerimeter(), 1e-9);
        assertEquals(0.12, rectangle.getArea(), 1e-9);
        assertThrows(IllegalArgumentException.class, rectangle::getRadiusOfTheCircumscribedCircle);
        assertThrows(IllegalArgumentException.class, rectangle::getRadiusOfTheInscribedCircle);
    }

    @Test
    void testInvalidRectangleWithNegativeSides() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-3, -3, -5, -5));
    }

    @Test
    void testZeroSidesRectangle() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0, 0, 0, 0));
    }

    @Test
    void testLargeRectangle() {
        // Test for a large rectangle
        Quadrangle rectangle = new Rectangle(3000000, 4000000, 3000000, 4000000);
        assertEquals(14000000, rectangle.getPerimeter(), 1e-9);
        assertEquals(12000000000000.0, rectangle.getArea(), 1e-9);
        assertThrows(IllegalArgumentException.class, rectangle::getRadiusOfTheCircumscribedCircle);
        assertThrows(IllegalArgumentException.class, rectangle::getRadiusOfTheInscribedCircle);
    }


    @Test
    void testFloatingPointRectangle() {
        // Тест для прямокутника з плаваючою точкою
        Quadrangle rectangle = new Rectangle(0.00003, 0.00004, 0.00003, 0.00004);
        assertEquals(0.00014, rectangle.getPerimeter(), 1e-15);
        assertEquals(1.2e-09, rectangle.getArea(), 1e-15);
        assertThrows(IllegalArgumentException.class, rectangle::getRadiusOfTheCircumscribedCircle);
        assertThrows(IllegalArgumentException.class, rectangle::getRadiusOfTheInscribedCircle);
    }

    @Test
    void testAlmostRectangle() {
        // Тест для чотирикутника, який майже є прямокутником, але не є ним
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(3, 4, 5, 6));
    }

    @Test
    void testRectangleSides() {
        Rectangle rectangle = new Rectangle(4, 6, 4, 6);
        assertEquals(4, rectangle.getSideA(), 1e-9);
        assertEquals(6, rectangle.getSideB(), 1e-9);
        assertEquals(4, rectangle.getSideC(), 1e-9);
        assertEquals(6, rectangle.getSideD(), 1e-9);

    }

    @Test
    void testRectangleConstructorSides() {
        Rectangle rectangle = new Rectangle(4, 6, 4, 6);
        assertEquals(4, rectangle.getSideA(), 1e-9);
        assertEquals(6, rectangle.getSideB(), 1e-9);
        assertEquals(4, rectangle.getSideC(), 1e-9);
        assertEquals(6, rectangle.getSideD(), 1e-9);
    }

    @Test
    void testNotARectangle() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(1, 2, 3, 4));
    }

    @Test
    void testSquareWithCircles() {
        // Тест для квадрата, де розрахунки кіл є дійсними
        Rectangle square = new Rectangle(5, 5, 5, 5);
        assertEquals(20, square.getPerimeter(), 1e-9);
        assertEquals(25, square.getArea(), 1e-9);
        assertEquals(2.5, square.getRadiusOfTheInscribedCircle(), 1e-9);
        assertEquals(Math.sqrt(2) * 2.5, square.getRadiusOfTheCircumscribedCircle());
    }

    @Test
    void testToString() {
        Rectangle square = new Rectangle(4, 5, 4, 5);
        String expectedString = "-----Rectangle-----\n" +
                "Sides of a quadrilateral = {4.0, 5.0, 4.0, 5.0}\n" +
                "Angle of a quadrilateral = {90.0, 90.0, 90.0, 90.0}\n\n";
        assertEquals(expectedString, square.toString());
    }
}
