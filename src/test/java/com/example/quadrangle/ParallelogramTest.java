package com.example.quadrangle;

import com.example.quadrangle.type.Parallelogram;
import com.example.quadrangle.type.Square;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParallelogramTest {

    @Test
    void testValidParallelogramSuccessful() {
        Parallelogram parallelogram = new Parallelogram(5, 10, 5, 10, Math.toRadians(60));
        assertEquals(30, parallelogram.getPerimeter(), 1e-9);
        assertEquals(5 * 10 * Math.sin(Math.toRadians(60)), parallelogram.getArea(), 1e-9);
    }

    @Test
    void testInvalidParallelogram() {
        assertThrows(IllegalArgumentException.class, () -> new Parallelogram(5, 10, 5, 8, Math.toRadians(60)));
    }

    @Test
    void testAnotherValidParallelogram() {
        Parallelogram parallelogram = new Parallelogram(7, 12, 7, 12, Math.toRadians(45));
        assertEquals(38, parallelogram.getPerimeter(), 1e-9);
        assertEquals(7 * 12 * Math.sin(Math.toRadians(45)), parallelogram.getArea(), 1e-9);
    }

    @Test
    void testEdgeCaseParallelogram() {
        Parallelogram parallelogram = new Parallelogram(0.3, 0.4, 0.3, 0.4, Math.toRadians(60));
        assertEquals(1.4, parallelogram.getPerimeter(), 1e-9);
        assertEquals(0.3 * 0.4 * Math.sin(Math.toRadians(60)), parallelogram.getArea(), 1e-9);
    }

    @Test
    void testInvalidParallelogramWithNegativeSides() {
        assertThrows(IllegalArgumentException.class, () -> new Parallelogram(-3, -4, -3, -4, Math.toRadians(60)));
    }

    @Test
    void testZeroSidesParallelogram() {
        assertThrows(IllegalArgumentException.class, () -> new Parallelogram(0, 0, 0, 0, Math.toRadians(60)));
    }

    @Test
    void testLargeParallelogram() {
        Parallelogram parallelogram = new Parallelogram(3000000, 4000000, 3000000, 4000000, Math.toRadians(60));
        assertEquals(14000000, parallelogram.getPerimeter(), 1e-9);
        assertEquals(1.0392304845413264E13, parallelogram.getArea(), 1e-9);
    }

    @Test
    void testFloatingPointParallelogram() {
        Parallelogram parallelogram = new Parallelogram(0.00003, 0.00004, 0.00003, 0.00004, Math.toRadians(60));
        assertEquals(0.00014, parallelogram.getPerimeter(), 1e-15);
        assertEquals(0.00003 * 0.00004 * Math.sin(Math.toRadians(60)), parallelogram.getArea(), 1e-15);
    }

    @Test
    void testAlmostParallelogram() {
        // Тест для чотирикутника, який майже є паралелограмом, але не є ним
        assertThrows(IllegalArgumentException.class, () -> new Parallelogram(3, 4, 3, 4.1, Math.toRadians(60)));
    }

    @Test
    void testToString() {
        Parallelogram parallelogram = new Parallelogram(4, 6, 4, 6, 60);
        String expectedString = "-----Parallelogram-----\n" +
                "Sides of a quadrilateral = {4.0, 6.0, 4.0, 6.0}\n" +
                "Angle of a quadrilateral = {60.0, 120.0, 60.0, 120.0}\n\n";
        assertEquals(expectedString, parallelogram.toString());
    }

}
