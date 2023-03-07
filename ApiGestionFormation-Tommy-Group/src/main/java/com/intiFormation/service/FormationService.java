package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.FormationDao;

import com.intiFormation.entity.Formation;

@Service
public class FormationService implements IFormationService {

	@Autowired
	FormationDao formationDao;
	
	
	public void inserer(Formation formation) {
		formationDao.save(formation);
	}
	
	public void enlever(int id) {
		formationDao.deleteById(id);
	}
	
	public List<Formation> chercherAll() {
		return formationDao.findAll();
	}
	
	public Optional<Formation> parId(int id) {
		return formationDao.findById(id);
	}
	
	
	
	
	
}
