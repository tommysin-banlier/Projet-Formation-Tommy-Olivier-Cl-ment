package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import com.intiFormation.entity.Utilisateur;

public interface IUtilisateurservice {
	
	public Utilisateur parUsername(String username);
	public void inserer(Utilisateur user);
	public void enlever(int id);
	public Optional<Utilisateur> parId(int id);
	public List<Utilisateur> chercherAll();
	public boolean verifierUsername(Utilisateur u);
	public void upgradeParticipant(int id);
	public void upgradeFormateur(int id);
	public void upgradeCommercial(int id);
	

}
