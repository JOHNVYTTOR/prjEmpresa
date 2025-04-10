package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Funcionario;
import com.example.demo.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {

	private FuncionarioRepository funcionarioRepository;
	
	@Autowired
	private FuncionarioService(FuncionarioRepository funcionarioRepository) {
			this.funcionarioRepository = funcionarioRepository;
	}
	
	public Funcionario getFuncionarioById(Long Id) {
		return funcionarioRepository.findById(Id).orElse(null);
	}
	
	public List<Funcionario> getAllFuncionarios(){
		return funcionarioRepository.findAll();
		
	}
	
	public Funcionario saveFuncionario(Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}
	
}
