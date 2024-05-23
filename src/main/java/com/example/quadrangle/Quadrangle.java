package com.example.quadrangle;

import com.example.Shape;

public abstract class Quadrangle implements Shape {
    protected final double SIDE_A;
    protected final double SIDE_B;
    protected final double SIDE_C;
    protected final double SIDE_D;
    protected final double ANGLE;

    private boolean isValidQuadrangle() {
        return  (2 * ANGLE + 2 * (180 - ANGLE) == 360) && ((getSideA() + getSideB() + getSideC() > getSideD()) &&
                (getSideA() + getSideB() + getSideD() > getSideC()) &&
                (getSideA() + getSideC() + getSideD() > getSideB()) &&
                (getSideB() + getSideC() + getSideD() > getSideA()));
    }

    public Quadrangle(double sideA, double sideB, double sideC, double sideD){
        SIDE_A = sideA;
        SIDE_B = sideB;
        SIDE_C = sideC;
        SIDE_D = sideD;
        ANGLE = 90;

        if(!isValidQuadrangle()){
            throw new IllegalArgumentException("Невірно вказані сторони для чотирикутника");
        }
    }

    public Quadrangle(double sideA, double sideB, double sideC, double sideD, double angle){
        SIDE_A = sideA;
        SIDE_B = sideB;
        SIDE_C = sideC;
        SIDE_D = sideD;
        ANGLE = angle;

        if(!isValidQuadrangle()){
            throw new IllegalArgumentException("Невірно вказані сторони для чотирикутника");
        }
    }

    public double getSideA() {
        return SIDE_A;
    }
    public double getSideB() {
        return SIDE_B;
    }
    public double getSideC() {
        return SIDE_C;
    }
    public double getSideD() {
        return SIDE_D;
    }

    @Override
    public String toString() {
        return "Sides of a quadrilateral = {" + SIDE_A + ", " + SIDE_B + ", " + SIDE_C + ", " + SIDE_D+ "}\n" + "Angle of a quadrilateral = {" + ANGLE + ", " + (180 - ANGLE) + ", " + ANGLE + ", " + (180 - ANGLE) + "}\n\n";
    }
}
