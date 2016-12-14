package org.formation.spring.test;

import org.formation.spring.model.ClientAutoWired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_TP4AWired {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beansAWired.xml");
		ClientAutoWired client = (ClientAutoWired) context.getBean("client");

		System.out.println(client);
	}

}
