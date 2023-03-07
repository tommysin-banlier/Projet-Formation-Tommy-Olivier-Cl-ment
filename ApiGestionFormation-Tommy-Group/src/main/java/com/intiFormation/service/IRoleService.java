package com.intiFormation.service;

import java.util.Optional;

import com.intiFormation.entity.Role;

public interface IRoleService {
	
	public Optional<Role> parId(int id);

}
