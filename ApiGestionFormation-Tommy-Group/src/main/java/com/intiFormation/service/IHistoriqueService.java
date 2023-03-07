package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import com.intiFormation.entity.Historique;

public interface IHistoriqueService {
	
	    //ajouter un historique d'appel
		public void inserer(Historique historique);
		
		//supprimer un historique
	    public void enlever(int id);
	 
		//Afficher les historiques
	    public List<Historique> chercherAll();
						
		//retrouver historique By id
		public Optional<Historique> parId(int id);

}
