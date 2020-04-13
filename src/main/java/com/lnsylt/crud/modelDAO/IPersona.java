package com.lnsylt.crud.modelDAO;

import java.util.List;

import com.lnsylt.crud.model.Persona;

public interface IPersona {
	public List<Persona> listAll();

	public Persona listPersonaId(int id);

	public int add(Persona p);

	public int edit(Persona p);

	public void delete(int id);

}
