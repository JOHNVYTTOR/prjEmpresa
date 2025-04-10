package com.example.demo.controllers;



import java.util.List;

import com.example.demo.entities.Departamento;
import com.example.demo.services.DepartamentoService;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {
	
	private final DepartamentoService departamentoService;
	
	public DepartamentoController (DepartamentoService departamentosService) {
		this.departamentoService = departamentosService;
	}
	
	@GetMapping
	public ResponseEntity<Departamento> findDepartamentoById(@PathVariable Long id){
		Departamento departamento = departamentoService.getDepartamentoById(id);
		
		if(departamento != null ) {
			return ResponseEntity.ok(departamento);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Departamento>> findAllDepartamentos(){
		List<Departamento>departamentos = departamentoService.getAllDepartamentos();
		return ResponseEntity.ok(departamentos);
	}

	@PostMapping("/")
	public ResponseEntity<Departamento> insertDepartamento(@RequestBody Departamento departamento){
		Departamento novodepartamento = departamentoService.saveDepartamento(departamento);
		return ResponseEntity.status(HttpStatus.CREATED).body(novodepartamento);
	}
}