package org.formation.spring.service;

import java.util.List;

import javax.annotation.Resource;

import org.formation.spring.dao.IClientDAO;
import org.formation.spring.model.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PrestiBanqueService {

	private static final Logger LOGGER = LoggerFactory.getLogger(PrestiBanqueService.class);

	@Resource
	IClientDAO iClientDAO;

	public void addClient(Client c) {
		iClientDAO.addClient(c);
	}

	public List<Client> listClients() {
		LOGGER.debug("lister clients");
		LOGGER.info("information");
		return iClientDAO.listClients();
	}

	public void deleteClient(int idClient) {
		iClientDAO.deleteClient(idClient);
	}

	public Client editClient(int idClient) {
		return iClientDAO.editClient(idClient);
	}

	public void uptadeClient(Client c) {
		iClientDAO.uptadeClient(c);
	}

	public List<Client> chercherClients(String motCle) {
		return iClientDAO.chercherClients(motCle);
	}

}
