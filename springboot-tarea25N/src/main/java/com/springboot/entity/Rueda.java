package com.springboot.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ruedas")
public class Rueda {
	
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false)
	private String tipo;
	
	@ManyToOne
	@JoinColumn(name="vehiculo_id", nullable = false)
	private Vehiculo vehiculo;

	public Rueda() {
		
	}
	
	

}
