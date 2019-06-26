package com.ginsan.shape;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class RectangleTest{

    @Test
    public void should_get_perimeter(){
        // given
        Rectangle rectangle = new Rectangle(1, 2);
        //when
        double perimeter = rectangle.getPerimeter();
        //then
        assertThat(perimeter).isEqualTo(6);
    }

    @Test
    public void should_get_area(){
        //given
        Rectangle rectangle = new Rectangle(1, 2);
        //when
        double area = rectangle.getArea();
        //then
        assertThat(area).isEqualTo(2);
    }

    @Test
    public void should_get_zero_perimeter(){
        //given
        Rectangle rectangle = new Rectangle(-1, -2);
        //when
        double area = rectangle.getArea();
        //then
        assertThat(area).isEqualTo(0);
    }
}