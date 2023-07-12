package com.truper.api.exam.dto;

import java.io.Serializable;

public class ClienteDTO implements Serializable {

private static final long serialVersionUID = 1L;
	
	private Long idCliente;
	private String nombre;
	private String archivo;
	
	public ClienteDTO(Long idCliente, String nombre, String archivo) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.archivo = archivo;
	}

	public ClienteDTO() {
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
