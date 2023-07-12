package com.truper.api.exam.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.truper.api.exam.dto.ListaCompraDTO;
import com.truper.api.exam.model.Response;
import com.truper.api.exam.service.IListaComprasService;
import static com.truper.api.exam.common.GlobalConstant.*;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = API_LISTACOMPRAS)
public class ListaCompraController {

	private IListaComprasService listaCompraService;
	public ListaCompraController (IListaComprasService listaCompraService) {
		this.listaCompraService = listaCompraService;
	}

	@GetMapping(value = GET_LISTACOMPRAS)
	public ResponseEntity<Response> getListCompra(@PathVariable Long id) {
		try {
			Optional<ListaCompraDTO> listaCompraDTO = listaCompraService.getEntity(id);
			if (listaCompraDTO.isPresent()) {
				return ResponseEntity.ok(
						Response.builder()
						.message(SUCCESS)
						.code(CODE_SUCCESS)
						.data(listaCompraDTO.get())
						.build()
						);
			} else {
				return ResponseEntity.ok(
						Response.builder()
						.message(UNSUCCESS)
						.code(CODE_SUCCESS)
						.data("")
						.build()
						);
			}
		}catch (Exception e) {
			log.info("Error Controller getListcompra: {}", e );
			return ResponseEntity.internalServerError().build();
		}
	}
	
	@PostMapping(value = SAVE_LISTACOMPRAS)
	public ResponseEntity<Response> saveListCompra(@RequestBody ListaCompraDTO listaCompraDTO) {
		try {
			Optional<ListaCompraDTO> listaCompoOp =listaCompraService.saveList(listaCompraDTO);
			if (listaCompoOp.isPresent()) {
				return ResponseEntity.ok(
						Response.builder()
						.message(SUCCESS)
						.code(CODE_SUCCESS)
						.data(listaCompoOp.get())
						.build()
						);
			} else {
				return ResponseEntity.ok(
						Response.builder()
						.message(UNSUCCESS)
						.code(CODE_SUCCESS)
						.data("")
						.build()
						);
			}
		}catch (Exception e) {
			log.info("Error Controller getListcompra: {}", e );
			return ResponseEntity.internalServerError().build();
		}
	}
	
	@PutMapping(value = UPDATE_LISTACOMPRAS)
	public ResponseEntity<Response> updateListCompra(@PathVariable Long id, @RequestBody ListaCompraDTO listaCompraDTO) {
		try {
			Optional<ListaCompraDTO> listaCompoOp =listaCompraService.updateList(listaCompraDTO, id);
			if (listaCompoOp.isPresent()) {
				return ResponseEntity.ok(
						Response.builder()
						.message(SUCCESS)
						.code(CODE_SUCCESS)
						.data(listaCompoOp.get())
						.build()
						);
			} else {
				return ResponseEntity.ok(
						Response.builder()
						.message(UNSUCCESS)
						.code(CODE_SUCCESS)
						.data("")
						.build()
						);
			}
		}catch (Exception e) {
			log.info("Error Controller getListcompra: {}", e );
			return ResponseEntity.internalServerError().build();
		}
	}
	
	@DeleteMapping(value = DELETE_LISTACOMPRAS)
	public ResponseEntity<Response> deleteListCompra(@PathVariable Long id) {
		try {
			Optional<ListaCompraDTO> listaCompoOp =listaCompraService.deleteList(id);
			if (listaCompoOp.isPresent()) {
				return ResponseEntity.ok(
						Response.builder()
						.message(SUCCESS)
						.code(CODE_SUCCESS)
						.data(listaCompoOp.get())
						.build()
						);
			} else {
				return ResponseEntity.ok(
						Response.builder()
						.message(UNSUCCESS)
						.code(CODE_SUCCESS)
						.data("")
						.build()
						);
			}
		}catch (Exception e) {
			log.info("Error Controller getListcompra: {}", e );
			return ResponseEntity.internalServerError().build();
		}
	}
	
	
}
