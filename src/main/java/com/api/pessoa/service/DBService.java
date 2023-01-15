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
public class DBService {

	@Autowired
	private PessoaRepository pessoaRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;

	public void instanciaBaseDeDados() {

		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Maximiliano");
		pessoa1.setDataNascimento(LocalDate.of(1585, 8, 5));
		Endereco endereco1 = new Endereco(null, "Rua Street", "321654-987", "125", "Madasgacar", pessoa1, false);
		Endereco endereco2 = new Endereco(null, "Rua de cima", "654-985", "21", "Cidade", pessoa1, false);
		Endereco endereco3 = new Endereco(null, "Rua Street bentl", "321654-985", "654321", "Cidade", pessoa1, true);
		Endereco endereco4 = new Endereco(null, "Rua de baixo", "321654-00", "1", "Cidade", pessoa1, false);
		Endereco endereco5 = new Endereco(null, "Rua Street large", "321654-985", "65", "Cidade", pessoa1, false);

		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Maano");
		pessoa2.setDataNascimento(LocalDate.of(9585, 1, 6));
		Endereco endereco6 = new Endereco(null, "Rua Street", "321654-987", "125", "Madasgacar", pessoa2, false);
		Endereco endereco7 = new Endereco(null, "Rua de cima", "654-985", "21", "Cidade", pessoa2, false);
		Endereco endereco8 = new Endereco(null, "Rua Street bentl", "321654-985", "654321", "Cidade", pessoa2, true);
		Endereco endereco9 = new Endereco(null, "Rua de baixo", "321654-00", "1", "Cidade", pessoa2, false);
		Endereco endereco10 = new Endereco(null, "Rua Street large", "321654-985", "65", "Cidade", pessoa2, false);

		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Apano");
		pessoa3.setDataNascimento(LocalDate.of(2585, 3, 1));
		Endereco endereco11 = new Endereco(null, "Rua Street", "321654-987", "125", "Madasgacar", pessoa3, false);
		Endereco endereco12 = new Endereco(null, "Rua de cima", "654-985", "21", "Cidade", pessoa3, false);
		Endereco endereco13 = new Endereco(null, "Rua Street bentl", "321654-985", "654321", "Cidade", pessoa3, true);
		Endereco endereco14 = new Endereco(null, "Rua de baixo", "321654-00", "1", "Cidade", pessoa3, false);
		Endereco endereco15 = new Endereco(null, "Rua Street large", "321654-985", "65", "Cidade", pessoa3, false);

		pessoa1.getEnderecos().addAll(Arrays.asList(endereco1, endereco2, endereco3, endereco4, endereco5));
		pessoa2.getEnderecos().addAll(Arrays.asList(endereco6, endereco7, endereco8, endereco9, endereco10));
		pessoa3.getEnderecos().addAll(Arrays.asList(endereco11, endereco12, endereco13, endereco14, endereco15));

		this.pessoaRepository.saveAll(Arrays.asList(pessoa1, pessoa2, pessoa3));
		this.enderecoRepository
				.saveAll(Arrays.asList(endereco1, endereco2, endereco3, endereco4, endereco5, endereco6, endereco7,
						endereco8, endereco9, endereco10, endereco11, endereco12, endereco13, endereco14, endereco15));

	}

}
