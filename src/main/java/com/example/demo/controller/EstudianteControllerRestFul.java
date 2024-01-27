package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

//API: determinada por el proyecto JAVA	


@RestController
@RequestMapping(path = "/estudiantes")
//servicio es la clase controller
public class EstudianteControllerRestFul {
	
	
	@Autowired
	private IEstudianteService estudianteService;
	
	
	//metodso->capacaidades: guardar
	@PostMapping(path = "/guardar")
	public void guardar(@RequestBody Estudiante estudiante) {
		this.estudianteService.guardar(estudiante);
	}
	
	//GET
	@GetMapping(path = "/buscar")
	public Estudiante buscar() {
		return this.estudianteService.buscar(1);
		
	
	}
	
	//http://localhost:8080/API/v1.0/Matricula/estudiantes/buscar

}
