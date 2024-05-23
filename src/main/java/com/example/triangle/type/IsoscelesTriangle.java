package com.example.triangle.type;

import com.example.triangle.Triangle;

public class IsoscelesTriangle extends Triangle {
    private final double EQUAL_SIDES;
    private final double TRIANGLE_BASE;

    private double getEqualSides() {
        if (getSideA() == getSideB()) {
            return getSideA();
        } else if (getSideA() == getSideC()) {
            return getSideA();
        } else {
            return getSideB();
        }
    }

    private boolean isValidIsoscelesTriangle() {
        return (getSideA() == getSideB()) || (getSideA() == getSideC()) || (getSideB() == getSideC());
    }

    public IsoscelesTriangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);

        if(!isValidIsoscelesTriangle()){
            throw new IllegalArgumentException("Невірно вказані сторони для Рівнобедренного трикутника");
        }

        EQUAL_SIDES = getEqualSides();
        TRIANGLE_BASE = (sideA + sideB + sideC) - 2 * EQUAL_SIDES;
    }

    @Override
    public double getPerimeter() {
        return TRIANGLE_BASE + 2 * EQUAL_SIDES;
    }

    @Override
    public double getArea() {
        double height = Math.sqrt(EQUAL_SIDES * EQUAL_SIDES - (TRIANGLE_BASE / 2) * (TRIANGLE_BASE / 2));
        return 0.5 * TRIANGLE_BASE * height;
    }

    @Override
    public double getRadiusOfTheInscribedCircle() {
        double semiPerimeter = getPerimeter() / 2;
        double area = getArea();
        return area / semiPerimeter;
    }

    @Override
    public double getRadiusOfTheCircumscribedCircle() {
        double area = getArea();
        return (EQUAL_SIDES * EQUAL_SIDES * TRIANGLE_BASE) / (4 * area);
    }

    @Override
    public String toString() {
        return "-----Isosceles Triangle-----\n" + super.toString();
    }
}
