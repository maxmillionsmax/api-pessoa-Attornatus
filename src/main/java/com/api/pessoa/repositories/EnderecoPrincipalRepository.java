package com.api.pessoa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.pessoa.domain.EnderecoPrincipal;

@Repository
public interface EnderecoPrincipalRepository extends JpaRepository<EnderecoPrincipal, Integer>{

}
