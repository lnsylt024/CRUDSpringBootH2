package com.lnsylt.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class CrudSpringBootH2Application implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTmplate;

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringBootH2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		jdbcTmplate.execute("Drop table h2Persona if Exists");
		jdbcTmplate.execute("create table h2persona(id Integer(11) primary key auto_increment, name varchar(255))");

		for (int i = 0; i < 3; i++) {
			jdbcTmplate.update("insert into h2persona(name) values('Persona 000" + i + "')");
		}
	}

}
