package com.gaurav;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Drawing {
	public static void main(String args[])
	{
		/*BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));*/
		ApplicationContext factory=new ClassPathXmlApplicationContext("spring.xml");
		/*factory.registerShutdownHook();*/
		Shape tr=(Shape)factory.getBean("circle");
		tr.draw();
		System.out.println(factory.getMessage("name", null, "this is default message", null));;
	}
}
