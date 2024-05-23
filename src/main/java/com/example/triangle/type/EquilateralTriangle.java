package com.example.triangle.type;

import com.example.triangle.Triangle;

public class EquilateralTriangle extends Triangle {
    private final double SIDE;

    private boolean isValidEquilateralTriangle() {
        return getSideA() == getSideB() && getSideA() == getSideC();
    }

    public EquilateralTriangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);

        if(!isValidEquilateralTriangle()){
            throw new IllegalArgumentException("Невірно вказані сторони для Рівностороннього трикутника");
        }

        SIDE = sideA;
    }

    @Override
    public double getPerimeter() {
        return SIDE * 3;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * SIDE * SIDE;
    }

    @Override
    public double getRadiusOfTheInscribedCircle() {
        return (SIDE * Math.sqrt(3)) / 6;
    }

    @Override
    public double getRadiusOfTheCircumscribedCircle() {
        return SIDE / Math.sqrt(3);
    }

    @Override
    public String toString() {
        return "-----Equilateral Triangle-----\n" + super.toString();
    }
}
