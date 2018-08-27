package br.com.pleasecode.tarolando.controller;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import javax.validation.Valid;

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
import br.com.pleasecode.tarolando.model.Local;
import br.com.pleasecode.tarolando.model.Plano;
import br.com.pleasecode.tarolando.model.View;
import br.com.pleasecode.tarolando.repository.LocalRepository;
import br.com.pleasecode.tarolando.repository.PlanoRepository;

@RestController
@RequestMapping("locais")
public class LocalController {
	
	private final LocalRepository localDAO;
	
	@Autowired
	public LocalController(LocalRepository localDAO) {
		this.localDAO = localDAO;
	}

	@GetMapping("/getAll")
	public Page<Local> getAll(Pageable pageable) {	
		return localDAO.findAll(pageable);
	}
	
	@GetMapping(path = "/{id}")
	public Local getById(@PathVariable("id") Long id) {
		
		return localDAO.findById(id).map(local -> {
			return local;
		}).orElseThrow(() -> new ResourceNotFoundException("Local não encontrado."));
	}
	
	@PostMapping
	public Local save(@Valid @RequestBody Local local) {
		return localDAO.save(local);
	}
	
	@PutMapping
	public ResponseEntity<?> atualiza(@RequestBody Local local) {
		localDAO.save(local);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestBody Local local) {
		localDAO.delete(local);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> deleteById(@PathVariable("id") Long id){

		return localDAO.findById(id).map(local -> {
			localDAO.delete(local); 
			return ResponseEntity.ok().build();
			}).orElseThrow(() -> new ResourceNotFoundException("Local não encontrado para deletar"));
	}
}
