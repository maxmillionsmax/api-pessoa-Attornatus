package com.api.pessoa.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.pessoa.domain.Endereco;
import com.api.pessoa.service.EnderecoService;


@RestController
@RequestMapping(value = "/endereco")
public class EnderecoResource {
	
	@Autowired
	private EnderecoService enderecoService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Endereco> findByid(@PathVariable Integer id){
		Endereco endereco = enderecoService.findById(id);
		return ResponseEntity.ok().body(endereco);
	}

}
