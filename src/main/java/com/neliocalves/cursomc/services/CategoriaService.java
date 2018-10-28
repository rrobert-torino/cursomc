package com.neliocalves.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neliocalves.cursomc.domain.Categoria;
import com.neliocalves.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService 
{
	
	/** definiamo dipendenza injection o
	 * 		inversion of control
	 */
	@Autowired
	private CategoriaRepository repo;
	
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		
		if(obj == null) {
			throw new ObjectNotFoundException("Object nao encontrado! Id: " + id + ", Tipo: "  + Categoria.class.getName()); 
		}
		return obj;
	}

}
