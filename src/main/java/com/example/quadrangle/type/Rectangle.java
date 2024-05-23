package com.example.quadrangle.type;

import com.example.quadrangle.Quadrangle;

public class Rectangle extends Quadrangle {
    private final double FIRST_SIDE;
    private final double SECOND_SIDE;

    private boolean isValidRectangle() {
        return (getSideA() == getSideC() && getSideB() == getSideD());
    }

    public Rectangle(double sideA, double sideB, double sideC, double sideD) {
        super(sideA, sideB, sideC, sideD);

        if(!isValidRectangle()){
            throw new IllegalArgumentException("Невірно вказані сторони для Прямокутника");
        }

        FIRST_SIDE = sideA;
        SECOND_SIDE = sideB;
    }

    @Override
    public double getPerimeter() {
        return 2 * (FIRST_SIDE + SECOND_SIDE);
    }

    @Override
    public double getArea() {
        return FIRST_SIDE * SECOND_SIDE;
    }

    @Override
    public double getRadiusOfTheInscribedCircle() {
        if (FIRST_SIDE == SECOND_SIDE) {
            return FIRST_SIDE / 2;
        }
        throw new IllegalArgumentException("Прямокутник не має вписаного кола, якщо він не є квадратом");
    }

    @Override
    public double getRadiusOfTheCircumscribedCircle() {
        if (FIRST_SIDE == SECOND_SIDE) {
            return Math.sqrt(FIRST_SIDE * FIRST_SIDE + SECOND_SIDE * SECOND_SIDE) / 2;
        }
        throw new IllegalArgumentException("Прямокутник не має вписаного кола, якщо він не є квадратом");
    }

    @Override
    public String toString() {
        return "-----Rectangle-----\n" + super.toString();
    }
}
