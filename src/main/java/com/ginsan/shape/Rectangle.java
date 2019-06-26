package com.ginsan.shape;

public class Rectangle {
    private double height ;
    private double width;

    public Rectangle(double length, double width) {
        this.height = Double.max(length,0);
        this.width = Double.max(width,0);
    }

    public double getPerimeter(){
        return (height+width)*2;
    }
    public double getArea(){
        return height*width;
    }

}
