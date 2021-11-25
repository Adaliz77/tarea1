package com.springboot.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "pagos")
public class Pago {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private double monto;
	@Column(nullable = false)
	private Date fechaPago;
	
	@Column(nullable = false)
	private String metodoPago;
	
	@OneToOne
	@JoinColumn(name = "factura_id")
	private Factura factura;
	
	

}
