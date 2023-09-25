package com.workintech.oop.MathModel;

public class Cuboid extends Rectangle {
    public double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height < 0 ? 0 : height;
    }
    public double getHeight() {
        return this.height;
    }
    public double getVolume() {
        return height * super.getArea();
    }
}
