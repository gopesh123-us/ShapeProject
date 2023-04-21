package com.learning.test;

import com.learning.shapes.Circle;
import com.learning.shapes.IShape;

public class ShapeTest {

	public static void main(String[] args) {
		IShape circle1 = new Circle(15);
		Circle circle2 = new Circle();
		circle2.setRadius(17.5);
		
		System.out.println("Area of first circle is " + circle1.calculateArea());
		System.out.println("Area of second circle is " + circle2.calculateArea());
	}

}
