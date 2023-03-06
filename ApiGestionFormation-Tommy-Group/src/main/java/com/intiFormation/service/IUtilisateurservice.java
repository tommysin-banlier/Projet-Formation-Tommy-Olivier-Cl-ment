package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import com.intiFormation.entity.Utilisateur;

public interface IUtilisateurservice {
	
	public Utilisateur chercherParUsername(String username);
	public void insererUser(Utilisateur user);
	public void enleverUtilisateur(int id);
	public Optional<Utilisateur> chercher_IdUnUtilisateur(int id);
	public List<Utilisateur> chercher_all_Utilisateur();
	public boolean verifierUsername(Utilisateur u);
	

}
