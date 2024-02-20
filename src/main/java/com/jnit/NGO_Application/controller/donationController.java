
package com.jnit.NGO_Application.controller;

import com.jnit.NGO_Application.model.donation;
import com.jnit.NGO_Application.repository.donationRepository;

import com.jnit.NGO_Application.service.donationService;


public class donationController implements donationService {
 private donationRepository donationRepository;

 public donationController(donationRepository donationRepository) {
     this.donationRepository = donationRepository;
 }

 public donation createDonation(String username, String email, String password) {
     donation newDonation = new donation();
     return donationRepository.save(newDonation);
 }

 public donation getDonationById(int donationId) {
     return donationRepository.findById(donationId);
 }

 public void updateDonation(donation donation) {
     donationRepository.update(donation);
 }

 public void deleteDonation(int donationId) {
     donationRepository.delete(donationId);
 }
}
