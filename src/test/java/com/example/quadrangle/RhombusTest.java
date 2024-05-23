package com.example.quadrangle;

import com.example.quadrangle.type.Rhombus;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RhombusTest {

    @Test
    void testValidRhombusSuccessful() {
        Rhombus rhombus = new Rhombus(5, 5, 5, 5, Math.toRadians(60));
        assertEquals(20, rhombus.getPerimeter(), 1e-9);
        assertEquals(5 * 5 * Math.sin(Math.toRadians(60)), rhombus.getArea(), 1e-9);
        assertEquals(5 * Math.sin(Math.toRadians(30)), rhombus.getRadiusOfTheInscribedCircle(), 1e-9);
    }

    @Test
    void testInvalidRhombus() {
        assertThrows(IllegalArgumentException.class, () -> new Rhombus(5, 5, 5, 6, Math.toRadians(60)));
    }

    @Test
    void testAnotherValidRhombus() {
        Rhombus rhombus = new Rhombus(10, 10, 10, 10, Math.toRadians(45));
        assertEquals(40, rhombus.getPerimeter(), 1e-9);
        assertEquals(10 * 10 * Math.sin(Math.toRadians(45)), rhombus.getArea(), 1e-9);
        assertEquals(10 * Math.sin(Math.toRadians(22.5)), rhombus.getRadiusOfTheInscribedCircle(), 1e-9);
    }

    @Test
    void testEdgeCaseRhombus() {
        Rhombus rhombus = new Rhombus(0.3, 0.3, 0.3, 0.3, Math.toRadians(60));
        assertEquals(1.2, rhombus.getPerimeter(), 1e-9);
        assertEquals(0.3 * 0.3 * Math.sin(Math.toRadians(60)), rhombus.getArea(), 1e-9);
        assertEquals(0.3 * Math.sin(Math.toRadians(30)), rhombus.getRadiusOfTheInscribedCircle(), 1e-9);
    }

    @Test
    void testInvalidRhombusWithNegativeSides() {
        assertThrows(IllegalArgumentException.class, () -> new Rhombus(-3, -3, -3, -3, Math.toRadians(60)));
    }

    @Test
    void testZeroSidesRhombus() {
        assertThrows(IllegalArgumentException.class, () -> new Rhombus(0, 0, 0, 0, Math.toRadians(60)));
    }

    @Test
    void testLargeRhombus() {
        Rhombus rhombus = new Rhombus(3000000, 3000000, 3000000, 3000000, Math.toRadians(60));
        assertEquals(12000000, rhombus.getPerimeter(), 1e-9);
        assertEquals(7.794228634059947E12, rhombus.getArea(), 1e-9);
        assertEquals(3000000 * Math.sin(Math.toRadians(30)), rhombus.getRadiusOfTheInscribedCircle(), 1e-9);
    }

    @Test
    void testFloatingPointRhombus() {
        Rhombus rhombus = new Rhombus(0.00003, 0.00003, 0.00003, 0.00003, Math.toRadians(60));
        assertEquals(0.00012, rhombus.getPerimeter(), 1e-15);
        assertEquals(0.00003 * 0.00003 * Math.sin(Math.toRadians(60)), rhombus.getArea(), 1e-15);
        assertEquals(0.00003 * Math.sin(Math.toRadians(30)), rhombus.getRadiusOfTheInscribedCircle(), 1e-15);
    }

    @Test
    void testAlmostRhombus() {
        // Тест для чотирикутника, який майже є ромбом, але не є ним
        assertThrows(IllegalArgumentException.class, () -> new Rhombus(3, 3, 3, 3.1, Math.toRadians(60)));
    }

    @Test
    void testToString() {
        Rhombus rhombus = new Rhombus(4, 4, 4, 4, 60);
        String expectedString = "-----Rhombus-----\n" +
                "Sides of a quadrilateral = {4.0, 4.0, 4.0, 4.0}\n" +
                "Angle of a quadrilateral = {60.0, 120.0, 60.0, 120.0}\n\n";
        assertEquals(expectedString, rhombus.toString());
    }
}
