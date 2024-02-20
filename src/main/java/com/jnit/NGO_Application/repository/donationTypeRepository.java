package com.jnit.NGO_Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jnit.NGO_Application.model.donationtype;

public class donationTypeRepository {
	@Repository
	public interface doantionTypeRepository extends JpaRepository<donationtype, Long> {
	    // You can add custom query methods here if needed
	}

	public donationtype save(donationtype newDonationType) {
		// TODO Auto-generated method stub
		return null;
	}

	public donationtype findById(int donationTypeId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(donationtype donationType) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int donationTypeId) {
		// TODO Auto-generated method stub
		
	}
}
