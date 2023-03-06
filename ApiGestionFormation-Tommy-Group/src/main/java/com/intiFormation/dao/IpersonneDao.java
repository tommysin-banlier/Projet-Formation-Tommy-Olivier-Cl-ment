package com.intiFormation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intiFormation.entity.Personne;
@Repository
public interface IpersonneDao extends JpaRepository<Personne,Integer>{

}
