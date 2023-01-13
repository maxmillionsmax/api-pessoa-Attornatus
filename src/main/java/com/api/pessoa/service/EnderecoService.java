package com.api.pessoa.service;

import java.util.List;
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
	@Autowired
	private PessoaService pessoaService;

	public Endereco findById(Integer id) {
		Optional<Endereco> obj = enderecoRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id:" +id+", Tipo: "+Endereco.class.getName()));
	}

	public List<Endereco> findAll(Integer id_pessoa) {
		pessoaService.findById(id_pessoa);
		return enderecoRepository.findAllByPessoa(id_pessoa);
	}

}
