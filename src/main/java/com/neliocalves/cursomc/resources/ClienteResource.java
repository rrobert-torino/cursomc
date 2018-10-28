package com.neliocalves.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neliocalves.cursomc.domain.Cliente;
import com.neliocalves.cursomc.services.ClienteService;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource 
{
	
	/** IoC */
	@Autowired
	private ClienteService service;
	
	
	/**
	 * Converte in automatico la lista in
	 * formato json:
	 * 
	 * @return
	 */
//	@RequestMapping(method=RequestMethod.GET)
//	public List<Cliente> listar(){
//		
//		Cliente cat1 = new Cliente(1, "Informatica");
//		Cliente cat2 = new Cliente(2, "Escritorio");
//		
//		List<Cliente> lista = new ArrayList<>();
//		lista.add(cat1);
//		lista.add(cat2);
//		
//		
//		return lista;
//	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) 
	{
		Cliente obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
























