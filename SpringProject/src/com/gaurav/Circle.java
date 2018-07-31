package com.gaurav;

public class Circle implements Shape{

	public Point circle;
	@Override
	public void draw() {
		System.out.println("Cicle class");
	}
	public Point getCircle() {
		return circle;
	}
	public void setCircle(Point circle) {
		this.circle = circle;
	}
	

}
