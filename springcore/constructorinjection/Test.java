package com.ust1.spring.springcore.constructorinjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/ust1/spring/springcore/constructorinjection/config.xml");
		Employee e = (Employee) ac.getBean("employee");
		System.out.println(e);
	}

}
