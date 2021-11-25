package com.springboot.entity;

import java.util.Set;

import javax.persistence.ManyToMany;

public class Alumno {
	private Long id;
	private String nombre;
	
	@ManyToMany
	Set<Profesor> profesores;

}
