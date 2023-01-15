package com.api.pessoa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.api.pessoa.domain.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

	@Query("SELECT obj FROM Endereco obj WHERE obj.pessoa.id = :id_pessoa ORDER BY id")
	List<Endereco> findAllByPessoa(@Param(value = "id_pessoa") Integer id_pessoa);

}
