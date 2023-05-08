package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.rest.entity.User;
import com.rest.reposity.UserRepo;

@Service
@Profile(value={"local","dev","prod","qa"})
public class UserService {
	
	@Autowired
	private UserRepo repo;
	
	public User saveUser(User user)
	{
		return repo.save(user);
		
	}
	
	
	public List<User> getAll()
	{
		return repo.findAll();
		
	}

}
