package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import com.intiFormation.entity.Formation;

public interface IFormationService {

	
	public void inserer(Formation formation);
	public void enlever(int id);
	public List<Formation> chercherAll();
	public Optional<Formation> parId(int id);
	public List<Formation> parFormateur(int id);
	public List<Formation> parParticipant(int id);
	
	
	
}
