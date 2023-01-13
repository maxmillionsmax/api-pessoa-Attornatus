package com.api.pessoa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.pessoa.domain.Endereco;
import com.api.pessoa.repositories.EnderecoRepository;
import com.api.pessoa.service.exceptions.ObjectNotFoundException;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository enderecoRepository;

	public Endereco findById(Integer id) {
		Optional<Endereco> obj = enderecoRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id:" +id+", Tipo: "+Endereco.class.getName()));
	}

}
