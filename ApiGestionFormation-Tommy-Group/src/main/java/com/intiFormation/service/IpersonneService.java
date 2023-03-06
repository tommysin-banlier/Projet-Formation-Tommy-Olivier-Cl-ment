package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import com.intiFormation.entity.Personne;

public interface IpersonneService {
	
	public void inserer(Personne p);
	public void enlever(int id);
	public void update(Personne p);
	public Optional<Personne> chercher_un(int id);
	public List<Personne> chercher_all();

}
