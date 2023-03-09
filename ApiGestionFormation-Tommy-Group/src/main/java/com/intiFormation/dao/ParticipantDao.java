package com.intiFormation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.intiFormation.entity.Participant;

public interface ParticipantDao extends JpaRepository<Participant, Integer> {

	
	@Query("SELECT participant from Participant participant JOIN participant.formations formation WHERE formation.id =:idFormation")
	public List<Participant> parFormation(@Param("idFormation") Integer idFormation);
	
	

	
	
	

	
}
