package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.HistoriqueDao;
import com.intiFormation.entity.Historique;


@Service
public class HistoriqueService implements IHistoriqueService {
	
	@Autowired
	private HistoriqueDao historiqueDao;
	
	//ajouter un historique d'appel
	public void inserer(Historique historique)
	{
		historiqueDao.save(historique);
	}
	
	 //supprimer un historique
		public void enlever(int id)
		{
			historiqueDao.deleteById(id);
		}
 
	//Afficher les historiques
    public List<Historique> chercherAll()
    {
    	return historiqueDao.findAll();
    }
					
	//retrouver historique By id
	public Optional<Historique> parId(int id)
	{
		return historiqueDao.findById(id);
	}
			
			
	

}
