package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import com.intiFormation.entity.Role;

public interface IRoleService {
	
	public Optional<Role> parId(int id);
	public void inserer(Role role);
	public void enlever(int id);
	public List<Role> chercherAll();

}
