package com.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.bean.Student;  

public class StudentApplication {
	public static void main(String[] args) {
	    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");  

	    Student student = (Student) ctx.getBean("studentbean");
	    ((ClassPathXmlApplicationContext) ctx).close();
	    
	    student.displayName();
	}
}
