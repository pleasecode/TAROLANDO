package br.com.pleasecode.tarolando.controller;

import java.util.ArrayList;
import java.util.List;

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
import br.com.pleasecode.tarolando.model.Atividade;
import br.com.pleasecode.tarolando.repository.AgenteRepository;
import br.com.pleasecode.tarolando.repository.AtividadeRepository;

@RestController
@RequestMapping("atividades")
public class AtividadeController {
	
	private final AtividadeRepository atividadeDAO;
	
	@Autowired
	public AtividadeController(AtividadeRepository atividadeDAO) {
		this.atividadeDAO = atividadeDAO;
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getAll() {
		return new ResponseEntity<>(atividadeDAO.findAll(), HttpStatus.OK);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<?> getById(@PathVariable("id") Long id) {
		
		return new ResponseEntity<>(atividadeDAO.findById(id),  HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Atividade atividade) {
		return new ResponseEntity<>(atividadeDAO.save(atividade), HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<?> atualiza(@RequestBody Atividade atividade) {
		atividadeDAO.save(atividade);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestBody Atividade atividade) {
		atividadeDAO.delete(atividade);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> deleteById(@PathVariable("id") Long id){
		atividadeDAO.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
