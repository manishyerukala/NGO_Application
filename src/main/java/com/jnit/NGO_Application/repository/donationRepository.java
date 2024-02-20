package com.jnit.NGO_Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jnit.NGO_Application.model.donation;
public class donationRepository {
	@Repository
	public interface donationrepository extends JpaRepository<donation, Long> {
	    // You can add custom query methods here if needed
	}

	public donation save(donation newDonation) {
		// TODO Auto-generated method stub
		return null;
	}

	public donation findById(int donationId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(donation donation) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int donationId) {
		// TODO Auto-generated method stub
		
	}

}
