package com.example;

import com.example.quadrangle.Quadrangle;
import com.example.quadrangle.type.Rectangle;
import com.example.triangle.Triangle;
import com.example.triangle.type.RightTriangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new RightTriangle(3, 4, 5);
        System.out.print(triangle + "~Result counting~\n");
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("RadiusOfTheInscribedCircle: " + triangle.getRadiusOfTheInscribedCircle());
        System.out.println("RadiusOfTheCircumscribedCircle: " + triangle.getRadiusOfTheCircumscribedCircle());

        Quadrangle quadrangle = new Rectangle(4, 6, 4, 6);
        System.out.print(quadrangle + "~Result counting~\n");
        System.out.println("Perimeter: " + quadrangle.getPerimeter());
        System.out.println("Area: " + quadrangle.getArea());

        try {
            System.out.println("RadiusOfTheInscribedCircle: " + quadrangle.getRadiusOfTheInscribedCircle());
        } catch (IllegalArgumentException e) {
            System.out.println("RadiusOfTheInscribedCircle: Not applicable for this quadrangle.");
        }

        try {
            System.out.println("RadiusOfTheCircumscribedCircle: " + quadrangle.getRadiusOfTheCircumscribedCircle());
        } catch (IllegalArgumentException e) {
            System.out.println("RadiusOfTheCircumscribedCircle: Not applicable for this quadrangle.");
        }
    }
}
