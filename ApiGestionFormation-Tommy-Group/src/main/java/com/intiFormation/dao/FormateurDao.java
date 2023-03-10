package com.intiFormation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.intiFormation.entity.Formateur;


public interface FormateurDao extends JpaRepository<Formateur, Integer> {

	
	@Query("SELECT formateur FROM Formateur formateur JOIN formateur.formations formation WHERE formation.id =:id ")
	public List<Formateur> parFormation(@Param("id") Integer id);
	
	
	
	
}
