package com.truper.api.exam.dto;

import java.io.Serializable;

public class ProductoDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idProducto;
	private String clave;
	private String descripcion;
	private String archivoBit;
	
	public ProductoDTO(Long idProducto, String clave, String descripcion, String archivoBit) {
		super();
		this.idProducto = idProducto;
		this.clave = clave;
		this.descripcion = descripcion;
		this.archivoBit = archivoBit;
	}

	public ProductoDTO() {
		super();
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getArchivoBit() {
		return archivoBit;
	}

	public void setArchivoBit(String archivoBit) {
		this.archivoBit = archivoBit;
	}
	
}
