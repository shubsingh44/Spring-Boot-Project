package com.shubham.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shubham.model.User;

@Repository
//@Transactional
public class UserDaoService {
	
	//@PersistenceContext
	//private EntityManager entityManager; 
	
	//@Autowired
	//private UserRepository userRepository;
	
	/*public void insert(User user)
	{
		userRepository.save(user);
		//return user.getId();
	}*/

	public List<User> findall() {
		// TODO Auto-generated method stub
		return null;
	}
}
