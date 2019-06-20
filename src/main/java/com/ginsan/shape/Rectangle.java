package com.ginsan.shape;

public class Rectangle {
    private int height ;
    private int width;

    public Rectangle(int length, int width) {
        this.height = Integer.max(length,0);
        this.width = Integer.max(width,0);
    }

    public int getPerimeter(){
        return (height+width)*2;
    }
    public int getArea(){
        return height*width;
    }

}
