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

import br.com.pleasecode.tarolando.model.Indicacao;
import br.com.pleasecode.tarolando.model.Local;
import br.com.pleasecode.tarolando.repository.IndicacaoRepository;
import br.com.pleasecode.tarolando.repository.LocalRepository;

@RestController
@RequestMapping("indicacoes")
public class IndicacaoController {
	
private final IndicacaoRepository indicacaoDAO;
	
	@Autowired
	public IndicacaoController(IndicacaoRepository indicacaoDAO) {
		this.indicacaoDAO = indicacaoDAO;
	}

	@GetMapping("/getAll")
	public ResponseEntity<?> getAll() {	
		return new ResponseEntity<>( indicacaoDAO.findAll(), HttpStatus.OK);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<?> getById(@PathVariable("id") Long id) {
		
		return new ResponseEntity<>(indicacaoDAO.findById(id),  HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Indicacao indicacao) {
		return new ResponseEntity<>(indicacaoDAO.save(indicacao), HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<?> atualiza(@RequestBody Indicacao indicacao) {
		indicacaoDAO.save(indicacao);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestBody Indicacao indicacao) {
		indicacaoDAO.delete(indicacao);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> deleteById(@PathVariable("id") Long id){
		indicacaoDAO.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
