package com.api.pessoa.dtos;

import java.io.Serializable;

import com.api.pessoa.domain.Endereco;

public class EnderecoDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String logradouro;
	private String cep;
	private String numero;
	private String cidade;
	private boolean principal;

	public EnderecoDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EnderecoDto(Endereco endereco) {
		super();
		this.id = endereco.getId();
		this.logradouro = endereco.getLogradouro();
		this.cep = endereco.getCep();
		this.numero = endereco.getNumero();
		this.cidade = endereco.getCidade();
		this.principal = endereco.isEnderecoPrincipal();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public boolean isPrincipal() {
		return principal;
	}

	public void setPrincipal(boolean principal) {
		this.principal = principal;
	}
	
	

}
