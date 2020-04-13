package com.lnsylt.crud.modelDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lnsylt.crud.model.Persona;

@Repository
public class PersonaDAO implements IPersona {

	@Autowired
	private JdbcTemplate jdbcTmlate;

	@Override
	public List<Persona> listAll() {
		String sql = "select * from h2persona";
		List<Persona> personas = jdbcTmlate.query(sql, new BeanPropertyRowMapper<Persona>(Persona.class));
		return personas;
	}

	@Override
	public Persona listPersonaId(int id) {
		String sql="select * from h2persona where id=?";
		Persona p = jdbcTmlate.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Persona>(Persona.class));
		return p;
	}

	@Override
	public int add(Persona p) {
		String sql="insert into h2persona(name) values(?)";
		int res =jdbcTmlate.update(sql, p.getName());
		return res;
	}

	@Override
	public int edit(Persona p) {
		String sql ="update h2persona set name=? where id=?";
		int res =jdbcTmlate.update(sql, new Object[]{p.getName(),p.getId()});
		return res;
	}

	@Override
	public void delete(int id) {
		String sql = "delete from h2persona where id=?";
		jdbcTmlate.update(sql, new Object[]{id});
	}

}
