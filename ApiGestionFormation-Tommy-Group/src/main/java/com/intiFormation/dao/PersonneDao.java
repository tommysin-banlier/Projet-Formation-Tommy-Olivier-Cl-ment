package com.intiFormation.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.intiFormation.entity.Personne;
@Repository
public interface PersonneDao extends JpaRepository<Personne,Integer>{
	@Modifying
	@Transactional
	@Query(value ="INSERT INTO utilisateur (id) VALUES(:idUtilisateur)", nativeQuery = true)
	public void upgradeUtilisateur(@Param("idUtilisateur")int id);

}
