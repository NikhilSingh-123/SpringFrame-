package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Student;
import com.entity.Department;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");

		Student s = context.getBean("stu", Student.class);
		System.out.println(s);

		Department d = context.getBean("dept", Department.class);
		System.out.println(d);

	}

}