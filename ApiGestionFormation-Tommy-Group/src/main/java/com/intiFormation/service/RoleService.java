package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.RoleDao;
import com.intiFormation.entity.Role;
@Service
public class RoleService  implements IRoleService{
	@Autowired
	private RoleDao roleDao;
	
	public void inserer(Role role)
	{roleDao.save(role);}
	
	public void enlever(int id)
	{roleDao.deleteById(id);}
	
	public Optional<Role> parId(int id)
	{Optional <Role> opt = roleDao.findById(id);
	return opt;}
	
	public List<Role> chercherAll()
	{return roleDao.findAll();}
	
	
	
}
