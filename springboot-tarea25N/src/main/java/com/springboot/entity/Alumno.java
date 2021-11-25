package com.springboot.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "alumnos")
public class Alumno {
	
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false)
	private String nombre;
	
	@ManyToMany
	Set<Profesor> profesores;

}
