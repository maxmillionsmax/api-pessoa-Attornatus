package com.api.pessoa.dtos;

import java.io.Serializable;

import com.api.pessoa.domain.Endereco;
import com.api.pessoa.domain.EnderecoPrincipal;
import com.api.pessoa.domain.Pessoa;

public class EnderecoPrincipalDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Endereco endereco;
	
	public EnderecoPrincipalDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EnderecoPrincipalDto(EnderecoPrincipal enderecoPrincipal) {
		super();
		this.id = enderecoPrincipal.getId();
		this.endereco = enderecoPrincipal.getEndereco();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
