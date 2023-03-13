package com.intiFormation.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.intiFormation.entity.Formation;
import com.intiFormation.entity.Paiement;


public interface PaiementDao extends JpaRepository<Paiement, Integer> {

	
	@Query("SELECT paiement from Paiement paiement WHERE paiement.formation.id =:id")
	public List<Paiement> parFormation(@Param("id") Integer id);
	
	
	@Query("SELECT paiement from Paiement paiement WHERE paiement.formation.id =:idFormation AND paiement.participant.id =:idParticipant")
	public Paiement parFormationParParticipant(@Param("idFormation") Integer idFormation, @Param("idParticipant") Integer idParticipant);
	
	

	
/*
 
  	@Query("SELECT formation FROM Formation formation JOIN formation.participants participant WHERE participant.id = :id")
	public List<Formation> parParticipant(@Param("id") Integer id);

  
  
  
  
 */
	
	
	
	
	
}
