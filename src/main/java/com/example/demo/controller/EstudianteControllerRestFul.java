package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	@PostMapping
	public void guardar(@RequestBody Estudiante estudiante) {
		this.estudianteService.guardar(estudiante);
	}
	
	//GET
	@GetMapping(path = "/{id}")
	public Estudiante buscar(@PathVariable Integer id) {
		return this.estudianteService.buscar(id);
	
	}
	
	
	@PutMapping(path = "/{id}")
	public void actualizar(@RequestBody Estudiante estudiante, @PathVariable Integer id) {
		
		estudiante.setId(id);
		
		this.estudianteService.actualizar(estudiante);
	}
	
	
	@PatchMapping(path = "/{id}")
	public void actualizarParcial(@RequestBody Estudiante estudiante, @PathVariable Integer id) {
		
		this.estudianteService.actualizarParcial(estudiante.getAepllido(), estudiante.getNombre(), id);
	}
	
	
	@DeleteMapping(path = "/{id}")
	public void borrar(@PathVariable Integer id) {
		this.estudianteService.borrar(id);
		
	}
	//http://localhost:8080/API/v1.0/Matricula/estudiantes/buscarTodos?genero=M
	//http://localhost:8080/API/v1.0/Matricula/estudiantes/buscarTodos?genero=M&edad=100
	@GetMapping
	public List<Estudiante> buscarTodos(@RequestParam(required = false, defaultValue = "M") String genero) {
		return this.estudianteService.buscarTodos(genero);
		
	}

	
	

}
