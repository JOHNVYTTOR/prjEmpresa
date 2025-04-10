package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Departamento;
import com.example.demo.repositories.DepartamentoRepository;

@Service
public class DepartamentoService {

	private DepartamentoRepository departamentoRepository;
	
	@Autowired
	private DepartamentoService(DepartamentoRepository departamentoRepository) {
			this.departamentoRepository = departamentoRepository;
	}
	
	public Departamento getDepartamentoById(Long Id) {
		return departamentoRepository.findById(Id).orElse(null);
	}
	
	public List<Departamento> getAllDepartamentos(){
		return departamentoRepository.findAll();
		
	}
	
	public Departamento saveDepartamento(Departamento departamento) {
		return departamentoRepository.save(departamento);
	}
	
}

