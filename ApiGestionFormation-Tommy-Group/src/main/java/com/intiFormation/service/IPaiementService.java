package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import com.intiFormation.entity.Paiement;

public interface IPaiementService {

	
	public void inserer(Paiement paiement);
	public void enlever(int id);
	public List<Paiement> chercherAll();
	public Optional<Paiement> parId(int id);
	public List<Paiement> parFormation(int id);
	
	
	
	
	
}
