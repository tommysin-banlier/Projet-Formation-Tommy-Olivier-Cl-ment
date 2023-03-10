package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.PersonneDao;
import com.intiFormation.entity.Personne;
@Service //il va creer un objet de la class service
public class PersonneService implements IPersonneService {
	
	
	@Autowired
	 PersonneDao personneDao;
	
	public void inserer(Personne p)
	{personneDao.save(p);}
	
	public void enlever(int id)
	{personneDao.deleteById(id);}
	
	
	public Optional<Personne> parId(int id)
	{Optional <Personne> opt = personneDao.findById(id);
	return opt;
	}
	
	public List<Personne> chercherAll()
	{return personneDao.findAll();}
	
	public void upgradeUtilisateur(int id)
	{personneDao.upgradeUtilisateur(id);}
}
