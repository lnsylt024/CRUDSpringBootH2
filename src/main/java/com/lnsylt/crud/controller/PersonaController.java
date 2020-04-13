package com.lnsylt.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

import com.lnsylt.crud.model.Persona;
import com.lnsylt.crud.service.IPersonaService;

@Controller
public class PersonaController {

	@Autowired
	private IPersonaService service;

	@GetMapping("/init")
	public String listar(Model model) {
		model.addAttribute("personas", service.listAll());
		return "index";
	}

	/**
	 * 新規
	 * 
	 * @return
	 */
	@GetMapping("/append")
	public String append() {
		return "appendpage";
	}

	@PostMapping("/add")
	public String add(@Valid Persona p) {
		service.add(p);
		return "redirect:/init";
	}

	@GetMapping("/edit/{id}")
	public String eidt(@PathVariable int id, Model model) {
		Persona p = service.listPersonaId(id);
		model.addAttribute("persona", p);
		return "editpage";
	}

	@PostMapping("/update")
	public String update(@Valid Persona p) {
		int cnt = service.edit(p);
		System.out.println("update cnt:" + cnt);
		return "redirect:/init";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		service.delete(id);
		return "redirect:/init";
	}
}
