package com.ginsan.shape;

public class Rectangle {
    private int length ;
    private int width;

    public Rectangle(int length, int width) {
        this.length = Integer.max(length,0);
        this.width = Integer.max(width,0);
    }

    public int getPerimeter(){
        return (length+width)*2;
    }
    public int getArea(){
        return length*width;
    }

}
