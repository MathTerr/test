package org.formation.spring.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Client extends Personne {

	private String login;
	private String motDePasse;

	@Autowired
	private Adresse adresse;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}


	public Client() {
		
	}

	@Override
	public String toString() {
		return "Client [login=" + login + ", motDePasse=" + motDePasse + ", adresse=" + adresse + ", getPrenom()="
				+ getPrenom() + ", getNom()=" + getNom() + ", getId()=" + getId() + "]";
	}


	
	
	

}
