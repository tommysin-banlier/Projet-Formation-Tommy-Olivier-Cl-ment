package com.intiFormation.entity;

import javax.persistence.Entity;

public class AuthentificationOk {
	 private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public AuthentificationOk(String message) {
		super();
		this.message = message;
	}
	 
	
	 

}
