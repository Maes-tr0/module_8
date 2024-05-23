package com.example.quadrangle.type;

import com.example.quadrangle.Quadrangle;

public class Parallelogram extends Quadrangle {
    private final double FIRST_SIDE;
    private final double SECOND_SIDE;

    private boolean isValidParallelogram() {
        return (getSideA() == getSideC() && getSideB() == getSideD());
    }

    public Parallelogram(double sideA, double sideB, double sideC, double sideD, double angle) {
        super(sideA, sideB, sideC, sideD, angle);

        if(!isValidParallelogram()){
            throw new IllegalArgumentException("Невірно вказані сторони для Паралелограма");
        }

        FIRST_SIDE = sideA;
        SECOND_SIDE = sideB;
    }

    @Override
    public double getPerimeter() {
        return 2 * FIRST_SIDE + 2 * SECOND_SIDE;
    }

    @Override
    public double getArea() {
        return FIRST_SIDE * SECOND_SIDE * Math.sin(ANGLE);
    }

    @Override
    public double getRadiusOfTheInscribedCircle() {
        if (FIRST_SIDE == SECOND_SIDE && ANGLE == 90) {
            return FIRST_SIDE / 2;
        }
        throw new IllegalArgumentException("Вписане коло не визначене для звичайного паралелограма.");
    }

    @Override
    public double getRadiusOfTheCircumscribedCircle() {
        if (FIRST_SIDE == SECOND_SIDE && ANGLE == 90) {
            return FIRST_SIDE * Math.sqrt(2) / 2;
        }
        throw new IllegalArgumentException("Описане коло не визначене для звичайного паралелограма.");
    }

    @Override
    public String toString() {
        return "-----Parallelogram-----\n" + super.toString();
    }
}
