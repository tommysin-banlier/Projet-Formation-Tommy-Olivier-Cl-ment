package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.ParticipantDao;
import com.intiFormation.entity.Participant;

@Service
public class ParticipantService implements IParticipantService {

	
	@Autowired
	ParticipantDao participantDao;
	
	
	public void inserer(Participant participant) {
		participantDao.save(participant);
	}
	
	public void enlever(int id) {
		participantDao.deleteById(id);
	}
	
	public List<Participant> chercherAll() {
		return participantDao.findAll();
	}
	
	public Optional<Participant> parId(int id) {
		return participantDao.findById(id);
	}
	
	
	
	
	
}
