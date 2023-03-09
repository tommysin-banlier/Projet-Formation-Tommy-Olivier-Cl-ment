package com.intiFormation.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.intiFormation.entity.Paiement;


public interface PaiementDao extends JpaRepository<Paiement, Integer> {

	
	@Query("SELECT paiement from Paiement paiement WHERE paiement.formation.id =:id")
	public List<Paiement> parFormation(@Param("id") Integer id);
	
	

	
	
	
	
}
