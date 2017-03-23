package com.company.a10.paramTest;

import com.company.a10.paramTest.figures.Circle;
import com.company.a10.paramTest.figures.Triangle;
import com.company.a10.paramTest.shape.Shape;

public class MethodParamTest {

    public static void main(String[] args) {

        MethodParamTest methodParamTest = new MethodParamTest();
        methodParamTest.drawSomething(new Triangle());
        methodParamTest.drawSomething(new Circle());

    }

    public void drawSomething(Shape shape) {
        shape.draw();
    }

}
