package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.FormateurDao;
import com.intiFormation.entity.Formateur;

@Service
public class FormateurService implements IFormateurService {

	
	@Autowired
	FormateurDao formateurDao;
	
	
	public void inserer(Formateur formateur) {
		formateurDao.save(formateur);
	}
	
	public void enlever(int id) {
		formateurDao.deleteById(id);
	}
	
	public List<Formateur> chercherAll() {
		return formateurDao.findAll();
	}
	
	public Optional<Formateur> parId(int id) {
		return formateurDao.findById(id);
	}
	
	public List<Formateur> parFormation(int id) {
		return formateurDao.parFormation(id);
	}
	
	
	
	
	
	
	
}
