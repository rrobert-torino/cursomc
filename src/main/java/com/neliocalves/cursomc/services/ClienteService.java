package com.neliocalves.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neliocalves.cursomc.domain.Cliente;
import com.neliocalves.cursomc.repositories.ClienteRepository;

@Service
public class ClienteService 
{
	
	/** definiamo dipendenza injection o
	 * 		inversion of control
	 */
	@Autowired
	private ClienteRepository repo;
	
	
	public Cliente buscar(Integer id) {
		Cliente obj = repo.findOne(id);
		
		if(obj == null) {
			throw new ObjectNotFoundException("Object nao encontrado! Id: " + id + ", Tipo: "  + Cliente.class.getName()); 
		}
		return obj;
	}

}
