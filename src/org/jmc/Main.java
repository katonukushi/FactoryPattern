package org.jmc;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = ShapeFactory.getRectangle();
        rectangle.draw();
    }
}