package com.api.pessoa.dtos;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.api.pessoa.domain.Pessoa;

public class PessoaDto implements Serializable{
		
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataNascimento;
	
	public PessoaDto() {
		super();
	}

	public PessoaDto(Pessoa pessoa) {
		super();
		this.id = pessoa.getId();
		this.nome = pessoa.getNome();
		this.dataNascimento = pessoa.getDataNascimento();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
