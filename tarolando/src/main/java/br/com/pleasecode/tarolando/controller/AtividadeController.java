package br.com.pleasecode.tarolando.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

import com.fasterxml.jackson.annotation.JsonView;

import br.com.pleasecode.tarolando.error.ResourceNotFoundException;
import br.com.pleasecode.tarolando.model.Agente;
import br.com.pleasecode.tarolando.model.Atividade;
import br.com.pleasecode.tarolando.model.View;
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
	public Page<Atividade> getAll(Pageable pageable) {
		return atividadeDAO.findAll(pageable);
	}
	
	@GetMapping(path = "/{id}")
	public Atividade getById(@PathVariable("id") Long id) {
		
		return atividadeDAO.findById(id).map(atividade -> {
			return atividade;
		}).orElseThrow(() -> new ResourceNotFoundException("Atividade não encontrada para o id" + id));
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
