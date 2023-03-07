package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import com.intiFormation.entity.Participant;

public interface IParticipantService {

	
	public void inserer(Participant participant);
	public void enlever(int id);
	public List<Participant> chercherAll();
	public Optional<Participant> parId(int id);
	
	
	
}
