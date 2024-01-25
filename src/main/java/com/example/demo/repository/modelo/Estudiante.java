package com.example.demo.repository.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "estudiante")
public class Estudiante {
	
	@Id
	@Column(name = "estu_id")			
	private Integer id;
	
	@Column(name = "estu_nombre")
	private String nombre;
	
	@Column(name = "estu_apellido")
	private String aepllido;
	
	@Column(name = "estu_genero")
	private String genero;
	
	@Column(name = "estu_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;

	
	
	
}
