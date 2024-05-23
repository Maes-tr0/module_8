package com.example.quadrangle.type;

import com.example.quadrangle.Quadrangle;

public class Square extends Quadrangle {
    private final double SIDE;

    private boolean isValidSquare() {
        return getSideA() == getSideB() && getSideA() == getSideC() && getSideA() == getSideD();
    }

    public Square(double sideA, double sideB, double sideC, double sideD) {
        super(sideA, sideB, sideC, sideD);

        if(!isValidSquare()){
            throw new  IllegalArgumentException("Невірно вказані сторони для Квадрату");
        }

        SIDE = sideA;
    }

    @Override
    public double getPerimeter() {
        return 4 * SIDE;
    }

    @Override
    public double getArea() {
        return SIDE * SIDE;
    }

    @Override
    public double getRadiusOfTheInscribedCircle() {
        return SIDE / 2;
    }

    @Override
    public double getRadiusOfTheCircumscribedCircle() {
        return SIDE * Math.sqrt(2) / 2;
    }

    @Override
    public String toString() {
        return "-----Square----\n" + super.toString();
    }
}
