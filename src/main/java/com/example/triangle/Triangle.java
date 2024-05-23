package com.example.triangle;

import com.example.Shape;

public abstract class Triangle implements Shape {
    protected final double SIDE_A;
    protected final double SIDE_B;
    protected final double SIDE_C;

    private boolean isValidTriangle() {
        return ((SIDE_A + SIDE_B > SIDE_C - 1e-9) && (SIDE_A + SIDE_C > SIDE_B - 1e-9) && (SIDE_B + SIDE_C > SIDE_A - 1e-9)) &&
                (SIDE_A > 0 && SIDE_B > 0 && SIDE_C > 0);
    }

    public Triangle(double sideA, double sideB, double sideC){
        SIDE_A = sideA;
        SIDE_B = sideB;
        SIDE_C = sideC;

        if(!isValidTriangle()){
            throw new IllegalArgumentException("Невірно вказані сторони для трикутника");
        }
    }

    public double getSideA(){
        return SIDE_A;
    }
    public double getSideB(){
        return SIDE_B;
    }
    public double getSideC(){
        return SIDE_C;
    }

    @Override
    public String toString() {
        return "Sides of a triangle = {" + SIDE_A + ", " + SIDE_B + ", " + SIDE_C + "}\n\n";
    }
}
