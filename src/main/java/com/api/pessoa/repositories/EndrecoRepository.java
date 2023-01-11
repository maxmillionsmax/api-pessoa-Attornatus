package com.api.pessoa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.pessoa.domain.Endereco;

@Repository
public interface EndrecoRepository extends JpaRepository<Endereco, Integer>{

}
