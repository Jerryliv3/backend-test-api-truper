package com.truper.api.exam.entity;

import java.io.Serializable;
import java.util.Calendar;

import com.truper.api.exam.dto.ClienteDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "ListaCompra")
public class ListaCompraEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idLista;
	
	@Column(name="CLIENTE_ID", nullable=false)
	private Long clienteId;
	
	@Column(name="NOMBRE", nullable=false, length=50)
	private String  nombre;
	
	@Column(name="FECHA_REGISTRO", nullable=false)
	@Temporal(TemporalType.DATE)
	private Calendar fechaRegistro;
	
	@Column(name="FECHA_ULTIMA_ACTUALZACION", nullable=false, length=512)
	@Temporal(TemporalType.DATE)
	private Calendar fechaUltimaActualizacion;
	
	@Column(name="ARCHIVO_BIT", nullable=false, length=512)
	private String archivoBit;
	
	public ListaCompraEntity(Long idLista, Long clienteId, String nombre, Calendar fechaRegistro,
			Calendar fechaUltimaActualizacion, String archivoBit) {
		super();
		this.idLista = idLista;
		this.clienteId = clienteId;
		this.nombre = nombre;
		this.fechaRegistro = fechaRegistro;
		this.fechaUltimaActualizacion = fechaUltimaActualizacion;
		this.archivoBit = archivoBit;
	}

	public ListaCompraEntity() {
		super();
	}

	public Long getIdLista() {
		return idLista;
	}

	public void setIdLista(Long idLista) {
		this.idLista = idLista;
	}

	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Calendar fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Calendar getFechaUltimaActualizacion() {
		return fechaUltimaActualizacion;
	}

	public void setFechaUltimaActualizacion(Calendar fechaUltimaActualizacion) {
		this.fechaUltimaActualizacion = fechaUltimaActualizacion;
	}

	public String getArchivoBit() {
		return archivoBit;
	}

	public void setArchivoBit(String archivoBit) {
		this.archivoBit = archivoBit;
	}

}
