package com.truper.api.exam.dto;

import java.io.Serializable;

public class ListaCompraDetalle implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long idListaCompra;
	private Long codigoProducto;
	private Long idLista;
	private Long  idCodigoProducto;
	private Integer cantidad;
	
	public ListaCompraDetalle(Long idListaCompra, Long codigoProducto, Long idLista, Long idCodigoProducto,
			Integer cantidad) {
		super();
		this.idListaCompra = idListaCompra;
		this.codigoProducto = codigoProducto;
		this.idLista = idLista;
		this.idCodigoProducto = idCodigoProducto;
		this.cantidad = cantidad;
	}

	public ListaCompraDetalle() {
		super();
	}

	public Long getIdListaCompra() {
		return idListaCompra;
	}

	public void setIdListaCompra(Long idListaCompra) {
		this.idListaCompra = idListaCompra;
	}

	public Long getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(Long codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public Long getIdLista() {
		return idLista;
	}

	public void setIdLista(Long idLista) {
		this.idLista = idLista;
	}

	public Long getIdCodigoProducto() {
		return idCodigoProducto;
	}

	public void setIdCodigoProducto(Long idCodigoProducto) {
		this.idCodigoProducto = idCodigoProducto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	
	
}
