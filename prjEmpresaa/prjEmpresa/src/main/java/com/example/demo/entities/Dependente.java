package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="tb_dependente")
public class Dependente {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String dependNome;
	
	private String paretesco;
	
	@ManyToOne
	@JoinColumn(name="funcionario_id")
	private Funcionario funcionario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDependNome() {
		return dependNome;
	}

	public void setDependNome(String dependNome) {
		this.dependNome = dependNome;
	}

	public String getParetesco() {
		return paretesco;
	}

	public void setParetesco(String paretesco) {
		this.paretesco = paretesco;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
	
}
