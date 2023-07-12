package com.truper.api.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truper.api.exam.entity.ListaCompraEntity;

public interface IListaCompraRepository extends JpaRepository<ListaCompraEntity, Long> {

}
