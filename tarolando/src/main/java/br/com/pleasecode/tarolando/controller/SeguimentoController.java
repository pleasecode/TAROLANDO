package br.com.pleasecode.tarolando.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pleasecode.tarolando.model.Agente;
import br.com.pleasecode.tarolando.model.Seguimento;
import br.com.pleasecode.tarolando.repository.AgenteRepository;
import br.com.pleasecode.tarolando.repository.SeguimentoRepository;

@RestController
@RequestMapping("seguimentos")
public class SeguimentoController {
	
	private final SeguimentoRepository seguimentoDAO;
	
	@Autowired
	public SeguimentoController(SeguimentoRepository seguimentoDAO) {
		this.seguimentoDAO = seguimentoDAO;
	}

	@GetMapping("/getAll")
	public ResponseEntity<?> getAll() {	
		return new ResponseEntity<>( seguimentoDAO.findAll(), HttpStatus.OK);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<?> getById(@PathVariable("id") Long id) {
		
		return new ResponseEntity<>(seguimentoDAO.findById(id),  HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Seguimento seguimento) {
		return new ResponseEntity<>(seguimentoDAO.save(seguimento), HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<?> atualiza(@RequestBody Seguimento seguimento) {
		seguimentoDAO.save(seguimento);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestBody Seguimento seguimento) {
		seguimentoDAO.delete(seguimento);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> deleteById(@PathVariable("id") Long id){
		seguimentoDAO.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}


}
