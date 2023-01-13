package com.api.pessoa.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.pessoa.domain.EnderecoPrincipal;
import com.api.pessoa.dtos.EnderecoPrincipalDto;
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
	
	@GetMapping
	public ResponseEntity<List<EnderecoPrincipalDto>> findall(){
		List<EnderecoPrincipal> list = enderecoPrincipalService.findAll();
		List<EnderecoPrincipalDto> enderecoPrincipalDtos = list.stream().map(obj -> new EnderecoPrincipalDto(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(enderecoPrincipalDtos);
	}
}
