package com.intiFormation.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("Commercial")
public class Commercial extends Utilisateur {
	
	

}
