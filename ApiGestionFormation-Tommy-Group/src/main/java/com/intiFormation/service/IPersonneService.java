package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import com.intiFormation.entity.Personne;

public interface IPersonneService {
	
	public void inserer(Personne p);
	public void enlever(int id);
	public Optional<Personne> parId(int id);
	public List<Personne> chercherAll();
	public void upgradeUtilisateur(int id);

}
