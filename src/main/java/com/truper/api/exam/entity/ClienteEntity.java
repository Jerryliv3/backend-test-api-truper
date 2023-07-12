package com.truper.api.exam.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cliente")
public class ClienteEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idCliente;
	
	@Column(name="NOMBRE", nullable=false)
	private String nombre;
	
	@Column(name="ARCHIVO", nullable=false)
	private String archivo;
	

	public ClienteEntity(Long idCliente, String nombre, String archivo) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.archivo = archivo;
	}
	public ClienteEntity() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getArchivo() {
		return archivo;
	}
	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	
}
