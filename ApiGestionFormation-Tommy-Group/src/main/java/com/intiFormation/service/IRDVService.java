package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import com.intiFormation.entity.RDV;

public interface IRDVService {
	
	//ajouter un RDV d'appel
	public void inserer(RDV rdv);
	
	//supprimer un RDV
	public void enlever(int id);
 
	//Afficher les RDVs
    public List<RDV> chercherAll();
					
	//retrouver RDV By id
	public Optional<RDV> parId(int id);
}
