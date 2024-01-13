package com.pp.bo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;


@Entity
@Table(name="VaccieneInfo")
public class VacceineDetails {
	
	@Id//primary key
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name="VACCEINE NAME")
	private String vacceineName;
	
	@Column(name="VACCEINE COMPANY")
	private String vacceineCompany;
	
	@Column(name="COST")
	private Integer price;

	public VacceineDetails() {
		System.out.println("vacceneDetails instantiated");
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVacceineName() {
		return vacceineName;
	}

	public void setVacceineName(String vacceineName) {
		this.vacceineName = vacceineName;
	}

	public String getVacceineCompany() {
		return vacceineCompany;
	}

	public void setVacceineCompany(String vacceineCompany) {
		this.vacceineCompany = vacceineCompany;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
	public VacceineDetails( String vacceineName, String vacceineCompany, Integer price) {
		super();
		
		this.vacceineName = vacceineName;
		this.vacceineCompany = vacceineCompany;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "VacceineDetails [id=" + id + ", vacceineName=" + vacceineName + ", vacceineCompany=" + vacceineCompany
				+ ", price=" + price + "]";
	}

	
	


	
	
}
