package com.codegym;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new Circle(5.0, "red", true);
        shapes[1] = new Rectangle(4.0, 6.0, "blue", false);
        shapes[2] = new Square(4.0, "yellow", true);

        Random random = new Random();

        for (Resizeable shape : shapes) {
            double percent = 1 + random.nextInt(100); // 1–100%
            System.out.println("Before resizing:");
            System.out.println(shape);

            double beforeArea = 0;
            double afterArea = 0;

            if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                beforeArea = c.getArea();
                c.resize(percent);
                afterArea = c.getArea();
            } else if (shape instanceof Rectangle && !(shape instanceof Square)) {
                Rectangle r = (Rectangle) shape;
                beforeArea = r.getArea();
                r.resize(percent);
                afterArea = r.getArea();
            } else if (shape instanceof Square) {
                Square s = (Square) shape;
                beforeArea = s.getArea();
                s.resize(percent);
                afterArea = s.getArea();
            }

            System.out.println("Resized by " + percent + "%");
            System.out.println("Area before: " + beforeArea);
            System.out.println("Area after: " + afterArea);
            System.out.println("--------------------------------");
        }
    }
}
