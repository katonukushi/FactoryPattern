package org.jmc;

public class ShapeFactory {
    public static Rectangle getRectangle() {
        return new Rectangle();
    }

    public static Circle getCircle() {
        return new Circle();
    }

    public static Square getSquare() {
        return new Square();
    }
}
