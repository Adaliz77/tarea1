package com.springboot.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {
	
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false)
	private String marca;
	
	@OneToMany(mappedBy = "vehiculo")
	private Set<Rueda> rueda;

	public Vehiculo() {
	
	}
	
	

}
