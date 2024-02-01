package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteService {

	

	//CREATE
	public void guardar (Estudiante estudiante);
	
	//UPDATE
	public void actualizar (Estudiante estudiante);
	
	public void actualizarParcial (String apellido, String nombre, Integer id);
	
	//READ
	public Estudiante buscar (Integer id);
	
	public List<Estudiante> buscarTodos (String genero);
	
	public void borrar (Integer id);
}
