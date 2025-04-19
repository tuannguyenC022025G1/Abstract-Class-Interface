package com.codegym;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(3.5, "blue", true);
        shapes[1] = new Rectangle(4.0, 5.0, "green", false);
        shapes[2] = new Square(6.0, "red", true); // Có Colorable
        shapes[3] = new Circle(2.0, "purple", false);

        for (Shape shape : shapes) {
            double area = 0;

            if (shape instanceof Circle) {
                area = ((Circle) shape).getArea();
            } else if (shape instanceof Square) {
                area = ((Square) shape).getArea();
            } else if (shape instanceof Rectangle) {
                area = ((Rectangle) shape).getArea();
            }

            System.out.println("Area: " + area);

            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }

            System.out.println("------------------------");
        }
    }
}
