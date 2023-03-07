package com.intiFormation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.RoleDao;
import com.intiFormation.entity.Role;
@Service
public class RoleService  implements IRoleService{
	@Autowired
	private RoleDao roleDao;
	
	public Optional<Role> parId(int id)
	{
		Optional<Role> opRole = roleDao.findById(id);
		return opRole;
	}
	
	
}
