package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.RDVDao;
import com.intiFormation.entity.RDV;

@Service
public class RDVService implements IRDVService {
	
	@Autowired
	private RDVDao rdvDao;
	
	
		    //ajouter un RDV d'appel
			public void inserer(RDV rdv)
			{
				rdvDao.save(rdv);
			}
			
			 //supprimer un RDV
				public void enlever(int id)
				{
					rdvDao.deleteById(id);
				}
		 
			//Afficher les RDVs
		    public List<RDV> chercherAll()
		    {
		    	return rdvDao.findAll();
		    }
							
			//retrouver RDV By id
			public Optional<RDV> parId(int id)
			{
				return rdvDao.findById(id);
			}
				

}
