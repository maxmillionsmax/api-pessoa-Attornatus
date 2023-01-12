package com.api.pessoa.resources;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.api.pessoa.domain.Pessoa;
import com.api.pessoa.dtos.PessoaDto;
import com.api.pessoa.service.PessoaService;


@RestController
@RequestMapping(value = "/pessoa")
public class PessoaResource {
	
	@Autowired
	private PessoaService pessoaService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Pessoa> findByid(@PathVariable Integer id){
		Pessoa pessoa = pessoaService.findById(id);
		return ResponseEntity.ok().body(pessoa);
	}
	
	@GetMapping
	public ResponseEntity<List<PessoaDto>> findAll(){
		List<PessoaDto> pessoaDtos = new ArrayList<PessoaDto>();
		pessoaDtos = pessoaService.findAll().stream().map(pessoa -> new PessoaDto(pessoa)).collect(Collectors.toList());
		return ResponseEntity.ok().body(pessoaDtos);
		
	}
	
	@PostMapping
	public ResponseEntity<Pessoa> create(@RequestBody Pessoa pessoa){
		pessoa = pessoaService.create(pessoa);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(pessoa.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
}
