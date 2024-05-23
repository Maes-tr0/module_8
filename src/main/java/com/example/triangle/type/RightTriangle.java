package com.example.triangle.type;

import com.example.triangle.Triangle;

public class RightTriangle extends Triangle {
    private final double HYPOTENUSE;
    private final double FIRST_SIDE;
    private final double SECOND_SIDE;

    private static final double TOLERANCE = 1e-9;

    private boolean isValidRightTriangle() {
        return Math.abs(HYPOTENUSE * HYPOTENUSE - (FIRST_SIDE * FIRST_SIDE + SECOND_SIDE * SECOND_SIDE)) < TOLERANCE;
    }

    private double getHypotenuse() {
        return Math.max(getSideA(), Math.max(getSideB(), getSideC()));
    }

    private double getTheSideIsNotTheHypotenuse(double hypotenuse) {
        return getSideA() != hypotenuse ? getSideA() : getSideB() != hypotenuse ? getSideB() : getSideC();
    }

    private double getTheSideIsNotTheHypotenuse(double hypotenuse, double anotherSide) {
        if (getSideA() != hypotenuse && getSideA() != anotherSide) {
            return getSideA();
        } else if (getSideB() != hypotenuse && getSideB() != anotherSide) {
            return getSideB();
        } else {
            return getSideC();
        }
    }

    public RightTriangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);

        HYPOTENUSE = getHypotenuse();
        FIRST_SIDE = getTheSideIsNotTheHypotenuse(HYPOTENUSE);
        SECOND_SIDE = getTheSideIsNotTheHypotenuse(HYPOTENUSE, FIRST_SIDE);

        if (!isValidRightTriangle()) {
            throw new IllegalArgumentException("Невірно вказані сторони для Прямокутного трикутника");
        }
    }

    @Override
    public double getPerimeter() {
        return FIRST_SIDE + SECOND_SIDE + HYPOTENUSE;
    }

    @Override
    public double getArea() {
        return 0.5 * FIRST_SIDE * SECOND_SIDE;
    }

    @Override
    public double getRadiusOfTheInscribedCircle() {
        return (FIRST_SIDE + SECOND_SIDE - HYPOTENUSE) / 2;
    }

    @Override
    public double getRadiusOfTheCircumscribedCircle() {
        return HYPOTENUSE / 2;
    }

    @Override
    public String toString() {
        return "-----Right-angled Triangle-----\n" + super.toString();
    }
}
