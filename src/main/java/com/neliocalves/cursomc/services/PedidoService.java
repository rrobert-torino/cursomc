package com.neliocalves.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neliocalves.cursomc.domain.Pedido;
import com.neliocalves.cursomc.repositories.PedidoRepository;
import com.neliocalves.cursomc.resources.exception.ObjectNotFoundException;

@Service
public class PedidoService 
{
	
	/** definiamo dipendenza injection o
	 * 		inversion of control
	 */
	@Autowired
	private PedidoRepository repo;
	
	
	public Pedido buscar(Integer id) {
		Pedido obj = repo.findOne(id);
		
		if(obj == null) {
			throw new ObjectNotFoundException("Object nao encontrado! Id: " + id + ", Tipo: "  + Pedido.class.getName()); 
		}
		return obj;
	}

}
