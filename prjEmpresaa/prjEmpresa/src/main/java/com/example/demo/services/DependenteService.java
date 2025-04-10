package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Dependente;
import com.example.demo.repositories.DependenteRepository;

@Service
public class DependenteService {

	private DependenteRepository dependenteRepository;
	
	@Autowired
	private DependenteService(DependenteRepository dependenteRepository) {
			this.dependenteRepository = dependenteRepository;
	}
	
	public Dependente getDependenteById(Long Id) {
		return dependenteRepository.findById(Id).orElse(null);
	}
	
	public List<Dependente> getAllDependente(){
		return dependenteRepository.findAll();
		
	}
	
	public Dependente saveDependente(Dependente dependente) {
		return dependenteRepository.save(dependente);
	}
	
}

