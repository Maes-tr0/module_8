package com.example.triangle.type;

import com.example.triangle.Triangle;

public class ScaleneTriangle extends Triangle {

    public ScaleneTriangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public double getPerimeter() {
        return getSideA() + getSideB() + getSideC();
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - getSideA()) * (s - getSideB()) * (s - getSideC()));
    }

    @Override
    public double getRadiusOfTheInscribedCircle() {
        return getArea() / (getPerimeter() / 2);
    }

    @Override
    public double getRadiusOfTheCircumscribedCircle() {
        return (getSideA() * getSideB() * getSideC()) / (4 * getArea());
    }

    @Override
    public String toString() {
        return "-----Scalene Triangle-----\n" + super.toString();
    }
}
