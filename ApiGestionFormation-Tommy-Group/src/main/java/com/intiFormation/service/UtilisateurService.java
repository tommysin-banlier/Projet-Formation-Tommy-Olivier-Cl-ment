package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.IutilisateurDao;
import com.intiFormation.entity.Utilisateur;
@Service
public class UtilisateurService implements IUtilisateurservice{
	
	@Autowired
	private IutilisateurDao utilisateurDao;
	
	public Utilisateur chercherParUsername(String username)
	{return utilisateurDao.findByUsername(username);}
	
	public void insererUser(Utilisateur user)
	{utilisateurDao.save(user);}
	
	public void enleverUtilisateur(int id)
	{utilisateurDao.deleteById(id);}
	
	public Optional<Utilisateur> chercher_IdUnUtilisateur(int id)
	{Optional <Utilisateur> opt = utilisateurDao.findById(id);
	return opt;}
	
	public List<Utilisateur> chercher_all_Utilisateur()
	{return utilisateurDao.findAll();}
	
	public boolean verifierUsername(Utilisateur u)
	{
		List<Utilisateur> utilisateurs = utilisateurDao.findAll();
		boolean resultat = true;
		for(Utilisateur user:utilisateurs)
		{
			if(user.getUsername().equals(u.getUsername()))
			{resultat = false;
			break;}
		}
		return resultat;
	}
	 
	
	

}
