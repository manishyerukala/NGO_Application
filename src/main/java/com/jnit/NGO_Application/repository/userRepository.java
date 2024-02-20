package com.jnit.NGO_Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jnit.NGO_Application.model.user;
@Repository
public class userRepository {
	public interface UserRepository extends JpaRepository<user, Long> {
	    // You can add custom query methods here if needed
	}

	public void update(user user) {
		// TODO Auto-generated method stub
		
	}

	public user findById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int userId) {
		// TODO Auto-generated method stub
		
	}

	public user save(user newUser) {
		// TODO Auto-generated method stub
		return null;
	}


}