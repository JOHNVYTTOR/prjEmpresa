package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_departamento")
public class Departamento {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	private String departNome;
	
	public Departamento( ) {
		
	}

	public Departamento(Long id, String departNome) {
		super();
		Id = id;
		this.departNome = departNome;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getDepartNome() {
		return departNome;
	}
	public void setDepartNome(String departNome) {
		this.departNome = departNome;
	}
	
	

}

