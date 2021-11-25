package com.springboot.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "medicos")
public class Medicocabecera implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nombre;
	@Column(nullable = false)
	private String apellido;
	@Column(nullable = false, unique = true)
	private String numeroColegiado;
	
	@OneToMany(mappedBy = "medicoCabecera", fetch = FetchType.LAZY,
			cascade = CascadeType.ALL)
	private Set<Paciente> paciente;
	
	public Medicocabecera() {
		
	}

	public Medicocabecera(String nombre, String apellido, String numeroColegiado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroColegiado = numeroColegiado;
	}
	
	
	
	

}
