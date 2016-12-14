package org.formation.spring.dao;

import java.util.List;

import org.formation.spring.model.Client;
import org.springframework.stereotype.Component;

@Component
public interface IClientDAO {

	public void addClient(Client c);

	public List<Client> listClients();

	public void deleteClient(int idClient);

	public Client editClient(int idClient);

	public void uptadeClient(Client c);

	public List<Client> chercherClients(String motCle);

}
