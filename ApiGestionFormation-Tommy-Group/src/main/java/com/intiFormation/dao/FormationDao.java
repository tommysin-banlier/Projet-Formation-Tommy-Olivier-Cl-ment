package com.intiFormation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.intiFormation.entity.Formation;
import com.intiFormation.entity.Participant;

public interface FormationDao extends JpaRepository<Formation, Integer> {


	
	
}
