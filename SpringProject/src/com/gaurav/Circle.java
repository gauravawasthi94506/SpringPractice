package com.gaurav;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class Circle implements Shape{

	private Point circle;
	@Autowired
	private MessageSource ms;
	
	public MessageSource getMs() {
		return ms;
	}
	public void setMs(MessageSource ms) {
		this.ms = ms;
	}
	@Override
	public void draw() {
		System.out.println("Cicle class");
		System.out.println("Printing values from Circle class"+this.ms.getMessage("name", null, "this is default message", null));
		System.out.println("Printing values for tringle class"+this.ms.getMessage("Circle.points", new Object[]{circle.getX(),circle.getY()}, "this is default message", null));
	}
	public Point getCircle() {
		return circle;
	}
	public void setCircle(Point circle) {
		this.circle = circle;
	}
	

}
