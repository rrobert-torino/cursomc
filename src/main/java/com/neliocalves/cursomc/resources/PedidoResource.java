package com.neliocalves.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neliocalves.cursomc.domain.Pedido;
import com.neliocalves.cursomc.services.PedidoService;

@RestController
@RequestMapping(value="/pedidos")
public class PedidoResource 
{
	
	/** IoC */
	@Autowired
	private PedidoService service;
	
	
	/**
	 * Converte in automatico la lista in
	 * formato json:
	 * 
	 * [{"id":1,"nome":"Informatica"},{"id":2,"nome":"Escritorio"}]
	 * 
	 * @return
	 */
//	@RequestMapping(method=RequestMethod.GET)
//	public List<Pedido> listar(){
//		
//		Pedido cat1 = new Pedido(1, "Informatica");
//		Pedido cat2 = new Pedido(2, "Escritorio");
//		
//		List<Pedido> lista = new ArrayList<>();
//		lista.add(cat1);
//		lista.add(cat2);
//		
//		
//		return lista;
//	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) 
	{
		Pedido obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
