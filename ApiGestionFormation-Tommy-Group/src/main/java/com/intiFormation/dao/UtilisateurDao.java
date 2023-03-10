package com.intiFormation.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.intiFormation.entity.Participant;
import com.intiFormation.entity.Utilisateur;

@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur,Integer>{

	public Utilisateur findByUsername(String username);
	

	@Modifying
	@Transactional
	@Query(value ="INSERT INTO participant (id) VALUES(:idParticipant)", nativeQuery = true)
	public void upgradeParticipant(@Param("idParticipant")int id);
	
	@Modifying
	@Transactional
	@Query(value ="INSERT INTO formateur (id) VALUES(:idFormateur)", nativeQuery = true)
	public void upgradeFormateur(@Param("idFormateur")int id);
	
	@Modifying
	@Transactional
	@Query(value ="INSERT INTO commercial (id) VALUES(:idCommercial)", nativeQuery = true)
	public void upgradeCommercial(@Param("idCommercial")int id);
	

}
