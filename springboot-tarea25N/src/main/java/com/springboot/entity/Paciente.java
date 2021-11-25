package com.springboot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pacientes")
public class Paciente implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1967786103805945563L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nombre;
	@Column(nullable = false)
	private String apellido;
	@Column(nullable = false, unique = true)
	private String numeroHistorial;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "medicocabecera_id", nullable = false)
	private Medicocabecera medicoCabecera;
	

	public Paciente() {
	
	}

	public Paciente(String nombre, String apellido, String numeroHistorial, Medicocabecera medicoCabecera) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroHistorial = numeroHistorial;
		this.medicoCabecera = medicoCabecera;
	}
	
	

}
