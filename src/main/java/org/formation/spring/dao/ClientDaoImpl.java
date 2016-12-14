package org.formation.spring.dao;

import java.util.List;

import org.formation.spring.model.Client;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class ClientDaoImpl implements IClientDAO{

	@Override
	public void addClient(Client c) {
		System.out.println("ClientDaoImpl.addClient");
		
	}

	@Override
	public List<Client> listClients() {
		System.out.println("ClientDaoImpl.listClients");
		return null;
	}

	@Override
	public void deleteClient(int idClient) {
		System.out.println("ClientDaoImpl.deleteClient");
		
	}

	@Override
	public Client editClient(int idClient) {
		System.out.println("ClientDaoImpl.editClient");
		return null;
	}

	@Override
	public void uptadeClient(Client c) {
		System.out.println("ClientDaoImpl.updateClient");
		
	}

	@Override
	public List<Client> chercherClients(String motCle) {
		System.out.println("ClientDaoImpl.chercherClient");
		return null;
	}

}
