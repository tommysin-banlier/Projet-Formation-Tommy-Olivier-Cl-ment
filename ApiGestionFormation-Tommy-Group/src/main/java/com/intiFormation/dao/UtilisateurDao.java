package com.intiFormation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intiFormation.entity.Utilisateur;
@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur,Integer>{

	public Utilisateur findByUsername(String username);
}
