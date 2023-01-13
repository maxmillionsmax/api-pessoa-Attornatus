package com.api.pessoa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.pessoa.domain.EnderecoPrincipal;
import com.api.pessoa.repositories.EnderecoPrincipalRepository;

@Service
public class EnderecoPrincipalService {

	@Autowired
	private EnderecoPrincipalRepository enderecoPrincipalRepository;
	
	public EnderecoPrincipal findById(Integer id) {
		Optional<EnderecoPrincipal> endereco = enderecoPrincipalRepository.findById(id);
		return endereco.orElse(null);
		
	}
	
	public List<EnderecoPrincipal> findAll(){
		return enderecoPrincipalRepository.findAll();
	}
}
