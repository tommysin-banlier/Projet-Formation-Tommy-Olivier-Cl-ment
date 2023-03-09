package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import com.intiFormation.entity.Commercial;

public interface ICommercialService {
	    
	    //ajouter un commercial
		public void inserer(Commercial commercial);
		
		//supprimer un commercial
		public void enlever(int id);
	 
		//Afficher les commerciaux
	    public List<Commercial> chercherAll();
						
		//retrouver commercial By id
		public Optional<Commercial> parId(int id);

}
