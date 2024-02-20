package com.jnit.NGO_Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jnit.NGO_Application.model.event;

public class eventRepository {
	
	@Repository
	public interface EventRepository extends JpaRepository<event, Long> {
	    // You can add custom query methods here if needed
	}

	public event save(event newEvent) {
		// TODO Auto-generated method stub
		return null;
	}

	public event findById(int eventId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(event event) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int eventId) {
		// TODO Auto-generated method stub
		
	}
}
