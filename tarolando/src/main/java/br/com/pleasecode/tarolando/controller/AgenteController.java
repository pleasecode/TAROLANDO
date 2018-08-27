package br.com.pleasecode.tarolando.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pleasecode.tarolando.model.Agente;
import br.com.pleasecode.tarolando.repository.AgenteRepository;

@RestController
@RequestMapping("agentes")
public class AgenteController {
	
	private final AgenteRepository agenteDAO;
		
	@Autowired
	public AgenteController(AgenteRepository agenteDAO) {
		this.agenteDAO = agenteDAO;
	}

	@GetMapping("/getAll")
	public ResponseEntity<?> getAll() {	
		return new ResponseEntity<>( agenteDAO.findAll(), HttpStatus.OK);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<?> getById(@PathVariable("id") Long id, 
			@AuthenticationPrincipal UserDetails userDatails) {
		System.out.print(userDatails);
		
		return new ResponseEntity<>(agenteDAO.findById(id),  HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Agente agente) {
		return new ResponseEntity<>(agenteDAO.save(agente), HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<?> atualiza(@RequestBody Agente agente) {
		agenteDAO.save(agente);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestBody Agente agente) {
		agenteDAO.delete(agente);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> deleteById(@PathVariable("id") Long id){
		agenteDAO.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
