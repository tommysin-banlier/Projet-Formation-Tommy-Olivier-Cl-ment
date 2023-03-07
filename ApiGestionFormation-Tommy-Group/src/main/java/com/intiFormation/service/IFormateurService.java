package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import com.intiFormation.entity.Formateur;

public interface IFormateurService {

	
	public void inserer(Formateur formateur);
	public void enlever(int id);
	public List<Formateur> chercherAll();
	public Optional<Formateur> parId(int id);
	
	
}
