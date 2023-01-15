package com.api.pessoa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.api.pessoa.domain.Pessoa;
import com.api.pessoa.dtos.PessoaDto;
import com.api.pessoa.repositories.PessoaRepository;
import com.api.pessoa.service.exceptions.ObjectNotFoundException;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public Pessoa findById(Integer id) {
		Optional<Pessoa> obj = pessoaRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id:" + id + ", Tipo: " + Pessoa.class.getName()));
	}

	public List<Pessoa> findAll() {
		return pessoaRepository.findAll();
	}

	public Pessoa create(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}

	public Pessoa update(Integer id, PessoaDto pessoaDto) {
		Pessoa obj = findById(id);
		obj.setNome(pessoaDto.getNome());
		obj.setDataNascimento(pessoaDto.getDataNascimento());
		return pessoaRepository.save(obj);
	}

	public void delete(Integer id) {
		findById(id);
		try {
			pessoaRepository.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new com.api.pessoa.service.exceptions.DataIntegrityViolationException(
					"Pessoa não pode ser deletada! Pois possui enderços associados.");
		}

	}
}
