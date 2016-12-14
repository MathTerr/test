package org.formation.spring.test;

import org.formation.spring.model.Client;
import org.formation.spring.service.ReportService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_TP4AWType {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beansAWType.xml");
		Client client = (Client) context.getBean("client");

		System.out.println(client);
	}

}
