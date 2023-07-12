package com.truper.api.exam.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.json.JsonMapper;
import com.truper.api.exam.dto.ListaCompraDTO;
import com.truper.api.exam.entity.ListaCompraEntity;
import com.truper.api.exam.repository.IListaCompraRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ListaCompraServiceImpl implements IListaComprasService{
	
	private IListaCompraRepository listaCompraRepository;
	private JsonMapper jsonMapper;
	
	public ListaCompraServiceImpl (IListaCompraRepository listaCompraRepository, JsonMapper jsonMapper) {
		this.listaCompraRepository = listaCompraRepository;
		this.jsonMapper = jsonMapper;
	}

	@Override
	@Transactional
	public Optional<ListaCompraDTO> saveList(ListaCompraDTO t) {
		try {
			ListaCompraEntity compraentity= listaCompraRepository.save(this.jsonMapper.convertValue(t, ListaCompraEntity.class));
			return Optional.of(this.jsonMapper.convertValue(compraentity, ListaCompraDTO.class));
		} catch (Exception e) {
			log.info("Error Service ListaCompra: {}", e);
		}
		return Optional.empty();
	}

	@Override
	public Optional<ListaCompraDTO> getEntity(Long id) {
		try {
			Optional<ListaCompraEntity> listaCompoOp =listaCompraRepository.findById(id);
			if (listaCompoOp.isPresent()) {
				return Optional.of( this.jsonMapper.convertValue(listaCompoOp.get(), ListaCompraDTO.class));
			}
		} catch (Exception e) {
			log.info("Error Service ListaCompra: {}", e);
		}
		return Optional.empty();
	}

	@Override
	@Transactional
	public Optional<ListaCompraDTO> updateList(ListaCompraDTO t, Long id) {
		try {
			Optional<ListaCompraDTO> listaCompra =  getEntity( id);
			if (listaCompra.isPresent()) {
				t.setIdLista(id);
				return saveList( t);
			}
 		} catch (Exception e) {
			log.info("Error Service ListaCompra: {}", e);
		}
		return Optional.empty();
	}

	@Override
	@Transactional
	public Optional<ListaCompraDTO> deleteList(Long id) {
		try {
			Optional<ListaCompraDTO> listaCompra =  getEntity( id);
			if (listaCompra.isPresent()) {
				listaCompraRepository.deleteById(id);
				return listaCompra;
			}
		} catch (Exception e) {
			log.info("Error Service ListaCompra: {}", e);
		}
		return Optional.empty();
	}

}
