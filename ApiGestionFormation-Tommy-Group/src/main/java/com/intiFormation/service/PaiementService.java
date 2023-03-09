package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.PaiementDao;
import com.intiFormation.entity.Paiement;

@Service
public class PaiementService implements IPaiementService {

	@Autowired
	PaiementDao paiementDao;
	
	
	public void inserer(Paiement paiement) {
		paiementDao.save(paiement);
	}
	
	public void enlever(int id) {
		paiementDao.deleteById(id);
	}
	
	public List<Paiement> chercherAll() {
		return paiementDao.findAll();
	}
	
	public Optional<Paiement> parId(int id) {
		return paiementDao.findById(id);
	}
	
	public List<Paiement> parFormation(int id) {
		return paiementDao.parFormation(id);
	}
	
	
	
	
	
	
	
	
	
	
	
}
