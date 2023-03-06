package com.intiFormation.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Historique {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 
@Temporal(TemporalType.DATE)
@DateTimeFormat(pattern="dd/MM/yyyy")
 private Date date;
 
 private String commentaire; 
 
	
	

}
