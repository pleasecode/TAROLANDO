package br.com.pleasecode.tarolando.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.pleasecode.tarolando.model.Agente;
import br.com.pleasecode.tarolando.model.Atividade;

public class AtividadeController {
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getAll() {
		List<Agente> listaAgentes = new ArrayList<>();
		return new ResponseEntity<>(listaAgentes, HttpStatus.OK);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<?> getById(@PathVariable("id") Long id) {
		
		return new ResponseEntity<>(null,  HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Atividade atividade) {
		return new ResponseEntity<>(atividade, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<?> atualiza(@RequestBody Atividade atividade) {
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestBody Atividade atividade) {
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> deleteById(@PathVariable("id") Long id){
		
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
