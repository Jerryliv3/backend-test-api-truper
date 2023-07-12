package com.truper.api.exam.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Productos")
public class ProductoEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idProducto;
	
	@Column(name="CLAVE", nullable=false, length=15)
	private String clave;
	
	@Column(name="DESCRIPCION", nullable=false, length=150)
	private String descripcion;
	
	@Column(name="ARCHIVO_BIT", nullable=false)
	private String archivoBit;
	
	public ProductoEntity(Long idProducto, String clave, String descripcion, String archivoBit) {
		super();
		this.idProducto = idProducto;
		this.clave = clave;
		this.descripcion = descripcion;
		this.archivoBit = archivoBit;
	}

	public ProductoEntity() {
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
