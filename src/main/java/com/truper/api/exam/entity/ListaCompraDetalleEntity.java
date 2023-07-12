package com.truper.api.exam.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ListaCompraDetalle")
public class ListaCompraDetalleEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long idListaCompra;
	
	@Column(name="CODIGO_PRODUCTO", nullable=false)
	private Long codigoProducto;
	
	@Column(name="ID_LISTA", nullable=false)
	private Long idLista;
	
	@Column(name="ID_CODIGO_PRODUCTO", nullable=false)
	private Long  idCodigoProducto;
	
	@Column(name="CANTIDAD", nullable=false)
	private Integer cantidad;
	
	public ListaCompraDetalleEntity(Long idListaCompra, Long codigoProducto, Long idLista, Long idCodigoProducto,
			Integer cantidad) {
		super();
		this.idListaCompra = idListaCompra;
		this.codigoProducto = codigoProducto;
		this.idLista = idLista;
		this.idCodigoProducto = idCodigoProducto;
		this.cantidad = cantidad;
	}

	public ListaCompraDetalleEntity() {
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
