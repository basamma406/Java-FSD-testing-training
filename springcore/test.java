package com.ust1.spring.springcore;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext cp= new ClassPathXmlApplicationContext("config.xml");
		Employee e =(Employee) cp.getBean("emp");
		System.out.println("Employee ID:"+e.getId());
		System.out.println("Employee Name:"+e.getName());
	}

}
