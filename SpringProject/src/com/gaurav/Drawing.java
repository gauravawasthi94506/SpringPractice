package com.gaurav;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Drawing {
	public static void main(String args[])
	{
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle tr=(Triangle)factory.getBean("triangle");
		tr.draw();
	}
}
