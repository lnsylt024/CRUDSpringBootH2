package com.lnsylt.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnsylt.crud.model.Persona;
import com.lnsylt.crud.modelDAO.IPersona;

@Service
public class PersonaService implements IPersonaService {

	@Autowired
	private IPersona personaDAO;

	@Override
	public List<Persona> listAll() {

		return personaDAO.listAll();
	}

	@Override
	public Persona listPersonaId(int id) {

		return personaDAO.listPersonaId(id);
	}

	@Override
	public int add(Persona p) {
		return personaDAO.add(p);
	}

	@Override
	public int edit(Persona p) {

		return personaDAO.edit(p);
	}

	@Override
	public void delete(int id) {
		personaDAO.delete(id);
	}

}
