package com.intiFormation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.intiFormation.entity.Participant;
import com.intiFormation.entity.Utilisateur;
@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur,Integer>{

	public Utilisateur findByUsername(String username);
	
	
	
	
	
	

	
	
	
}
