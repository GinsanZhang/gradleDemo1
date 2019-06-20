package com.ginsan.shape;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest{

    @Test
    public void should_get_perimeter(){
        // given
        Rectangle rectangle = new Rectangle(1, 2);
        //when
        int perimeter = rectangle.getPerimeter();
        //then
        assertEquals(6, perimeter);
    }

    @Test
    public void should_get_area(){
        //given
        Rectangle rectangle = new Rectangle(1, 2);
        //when
        int area = rectangle.getArea();
        //then
        assertEquals(2, area);
    }

    @Test
    public void should_get_zero_perimeter(){
        //given
        Rectangle rectangle = new Rectangle(-1, -2);
        //when
        int area = rectangle.getArea();
        //then
        assertEquals(area,0);
    }
}