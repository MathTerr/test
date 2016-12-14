package org.formation.spring.test;

import org.formation.spring.config.ClientConfig;
import org.formation.spring.model.Client;
import org.formation.spring.service.PrestiBanqueService;
import org.formation.spring.service.ReportService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_TP5 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ClientConfig.class);
		PrestiBanqueService banqueService = (PrestiBanqueService) context.getBean("prestiBanqueService", PrestiBanqueService.class);

		banqueService.listClients();
	}

}
