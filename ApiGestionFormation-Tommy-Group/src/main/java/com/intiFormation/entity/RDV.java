package com.intiFormation.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class RDV {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	

}
