package com.api.pessoa.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.pessoa.domain.Endereco;
import com.api.pessoa.dtos.EnderecoDto;
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

	@GetMapping
	public ResponseEntity<List<EnderecoDto>> findAll(@RequestParam(value = "pessoa", defaultValue = "0") Integer id_pessoa){
		List<EnderecoDto> enderecoDto = new ArrayList<EnderecoDto>();
		enderecoDto = enderecoService.findAll(id_pessoa).stream().map(endereco -> new EnderecoDto(endereco)).collect(Collectors.toList());
		return ResponseEntity.ok().body(enderecoDto);
		
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Endereco> update(@PathVariable Integer id, @RequestBody Endereco endereco){
		Endereco newEndereco = enderecoService.update(id, endereco);
		return ResponseEntity.ok().body(newEndereco);
	}
	
	@PatchMapping(value = "/{id}")
	public ResponseEntity<Endereco> updatePatch(@PathVariable Integer id, @RequestBody Endereco endereco){
		Endereco newEndereco = enderecoService.update(id, endereco);
		return ResponseEntity.ok().body(newEndereco);
	}
}
