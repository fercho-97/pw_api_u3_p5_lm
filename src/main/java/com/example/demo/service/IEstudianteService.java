package com.example.demo.service;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteService {

	

	//CREATE
	public void guardar (Estudiante estudiante);
	
	//UPDATE
	public void actualizar (Estudiante estudiante);
	
	public void actualizarParcial (String apellido, String nombre, Integer id);
	
	//READ
	public Estudiante buscar (Integer id);
	
	public void borrar (Integer id);
}
