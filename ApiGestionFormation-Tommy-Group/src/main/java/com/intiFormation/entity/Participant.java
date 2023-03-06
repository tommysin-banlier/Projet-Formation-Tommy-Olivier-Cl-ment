package com.intiFormation.entity;

import java.util.List;

import javax.persistence.*;
import javax.persistence.ManyToOne;

@Entity
public class Participant extends Utilisateur{

	@ManyToOne
	@JoinColumn(name = "idFormation")
	private List<Formation> formations;
	
	@OneToOne(mappedBy = "participant")
	private Paiement paiement;

	public Participant(int id, String username, String password, Role role) {
		super(id, username, password, role);
		// TODO Auto-generated constructor stub
	}

	public Participant(String username, String password, Role role) {
		super(username, password, role);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
