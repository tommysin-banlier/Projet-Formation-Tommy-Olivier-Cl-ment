package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.UtilisateurDao;
import com.intiFormation.entity.Utilisateur;
@Service
public class UtilisateurService implements IUtilisateurservice{
	
	@Autowired
	private UtilisateurDao utilisateurDao;
	
	public Utilisateur parUsername(String username)
	{return utilisateurDao.findByUsername(username);}
	
	public void inserer(Utilisateur user)
	{utilisateurDao.save(user);}
	
	public void enlever(int id)
	{utilisateurDao.deleteById(id);}
	
	public Optional<Utilisateur> parId(int id)
	{Optional <Utilisateur> opt = utilisateurDao.findById(id);
	return opt;}
	
	public List<Utilisateur> chercherAll()
	{return utilisateurDao.findAll();}
	
	public void upgradeParticipant(int id)
	{utilisateurDao.upgradeParticipant(id);}
	
	public void upgradeFormateur(int id)
	{utilisateurDao.upgradeFormateur(id);}
	
	public void upgradeCommercial(int id)
	{utilisateurDao.upgradeCommercial(id);}
	
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
