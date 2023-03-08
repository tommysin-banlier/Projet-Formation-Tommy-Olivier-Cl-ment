package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.CommercialDao;

import com.intiFormation.entity.Commercial;

@Service
public class CommercialService implements ICommercialService {

	@Autowired
	private CommercialDao commercialDao;
	
	//ajouter un commercial
	public void inserer(Commercial commercial)
	{
		commercialDao.save(commercial);
	}
	
	 //supprimer un commercial
		public void enlever(int id)
		{
			commercialDao.deleteById(id);
		}
 
	//Afficher les commerciaux
    public List<Commercial> chercherAll()
    {
    	return commercialDao.findAll();
    }
					
	//retrouver commercial By id
	public Optional<Commercial> parId(int id)
	{
		return commercialDao.findById(id);
	}
}
