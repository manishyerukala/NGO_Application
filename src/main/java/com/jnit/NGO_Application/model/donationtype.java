package com.jnit.NGO_Application.model;

import java.util.List;

import javax.persistence.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
@Table(name = "donationtype")
public class donationtype {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="typeName")
    private String typeName;


    @OneToMany(mappedBy = "donationType")
    private List<donation> donations;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTypeName() {
		return typeName;
	}


	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}


	public List<donation> getDonations() {
		return donations;
	}


	public void setDonations(List<donation> donations) {
		this.donations = donations;
	}
    

}