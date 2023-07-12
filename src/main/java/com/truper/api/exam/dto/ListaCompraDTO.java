package com.truper.api.exam.dto;

import java.io.Serializable;
import java.util.Calendar;

public class ListaCompraDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long idLista;
	private Long clienteId;
	private String  nombre;
	private Calendar fechaRegistro;
	private Calendar fechaUltimaActualizacion;
	private String archivoBit;
	
	public ListaCompraDTO(Long idLista, Long clienteId, String nombre, Calendar fechaRegistro,
			Calendar fechaUltimaActualizacion, String archivoBit) {
		super();
		this.idLista = idLista;
		this.clienteId = clienteId;
		this.nombre = nombre;
		this.fechaRegistro = fechaRegistro;
		this.fechaUltimaActualizacion = fechaUltimaActualizacion;
		this.archivoBit = archivoBit;
	}

	public ListaCompraDTO() {
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
