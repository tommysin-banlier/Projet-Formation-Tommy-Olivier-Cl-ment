package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.IpersonneDao;
import com.intiFormation.entity.Personne;
@Service //il va creer un objet de la class service
public class PersonneService implements IpersonneService {
	
	
	@Autowired
	 IpersonneDao personneDao;
	
	public void inserer(Personne p)
	{personneDao.save(p);}
	
	public void enlever(int id)
	{personneDao.deleteById(id);}
	
	public void update(Personne p)
	{personneDao.save(p);}
	
	public Optional<Personne> chercher_un(int id)
	{Optional <Personne> opt = personneDao.findById(id);
	return opt;
	}
	
	public List<Personne> chercher_all()
	{return personneDao.findAll();}
}
