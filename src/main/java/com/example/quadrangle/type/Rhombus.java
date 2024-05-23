package com.example.quadrangle.type;

import com.example.quadrangle.Quadrangle;

public class Rhombus extends Quadrangle {
    private final double SIDE;

    private boolean isValidRhombus() {
        return getSideA() == getSideB() && getSideA() == getSideC() && getSideA() == getSideD();
    }

    public Rhombus(double sideA, double sideB, double sideC, double sideD, double angle) {
        super(sideA, sideB, sideC, sideD, angle);

        if(!isValidRhombus()){
            throw new  IllegalArgumentException("Невірно вказані сторони для Ромбу");
        }

        SIDE = sideA;
    }

    @Override
    public double getPerimeter() {
        return 4 * SIDE;
    }

    @Override
    public double getArea() {
        return SIDE * SIDE * Math.sin(ANGLE);
    }

    @Override
    public double getRadiusOfTheInscribedCircle() {
        return SIDE * Math.sin(ANGLE / 2);
    }

    @Override
    public double getRadiusOfTheCircumscribedCircle() {
        if (ANGLE == 90) {
            return SIDE / Math.sqrt(2);
        }
        throw new IllegalArgumentException("Описане коло не визначене для звичайного ромба.");
    }

    @Override
    public String toString() {
        return "-----Rhombus-----\n" + super.toString();
    }
}
