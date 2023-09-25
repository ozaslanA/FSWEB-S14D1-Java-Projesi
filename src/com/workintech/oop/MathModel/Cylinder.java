package com.workintech.oop.MathModel;

public class Cylinder extends  Circle  {

    public double height;



    public Cylinder(double radius,double height) {
        super(radius);
        if (height<0){
            this.height =0;
              }else{
        this.height = height;
        }
}
    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return height * super.getArea();
    }
}