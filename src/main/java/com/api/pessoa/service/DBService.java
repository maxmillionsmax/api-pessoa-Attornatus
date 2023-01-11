package com.api.pessoa.service;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.pessoa.domain.Endereco;
import com.api.pessoa.domain.Pessoa;
import com.api.pessoa.repositories.EnderecoRepository;
import com.api.pessoa.repositories.PessoaRepository;

@Service
public class DBService{
	
	@Autowired
	private PessoaRepository pessoaRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public void instanciaBaseDeDados(){
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Maximiliano");
		pessoa1.setDataNascimento(LocalDate.of(1585, 8, 5));
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Maano");
		pessoa2.setDataNascimento(LocalDate.of(9585, 1, 6));
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Apano");
		pessoa3.setDataNascimento(LocalDate.of(2585, 3, 1));
		
		Endereco endereco1 = new Endereco(null, "Rua Street", "321654-985", "654321", "Cidade", pessoa1);
		Endereco endereco2 = new Endereco(null, "Rua de cima", "654-985", "21", "Cidade", pessoa1);
		Endereco endereco3 = new Endereco(null, "Rua Street", "321654-985", "654321", "Cidade", pessoa2);
		Endereco endereco4 = new Endereco(null, "Rua de baixo", "321654-00", "1", "Cidade", pessoa2);
		Endereco endereco5 = new Endereco(null, "Rua Street", "321654-985", "65", "Cidade", pessoa3);
				
		pessoa1.getEnderecos().addAll(Arrays.asList(endereco1,endereco2));
		pessoa2.getEnderecos().addAll(Arrays.asList(endereco3,endereco4));
		pessoa3.getEnderecos().addAll(Arrays.asList(endereco5));
				
		this.pessoaRepository.saveAll(Arrays.asList(pessoa1,pessoa2,pessoa3));
		this.enderecoRepository.saveAll(Arrays.asList(endereco1,endereco2,endereco3,endereco4,endereco5));
		
		
	}

}
