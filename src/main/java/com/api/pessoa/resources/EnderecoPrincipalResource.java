package com.api.pessoa.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.pessoa.domain.EnderecoPrincipal;
import com.api.pessoa.service.EnderecoPrincipalService;

@RestController
@RequestMapping(value = "/endereco-principal")
public class EnderecoPrincipalResource {
	
	@Autowired
	private EnderecoPrincipalService enderecoPrincipalService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<EnderecoPrincipal> findbyId(@PathVariable Integer id){
		EnderecoPrincipal endereco = enderecoPrincipalService.findById(id);
		return ResponseEntity.ok().body(endereco);
	}

}
