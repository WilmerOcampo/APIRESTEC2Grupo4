package com.grupo4.apirest.repository;

import com.grupo4.apirest.model.db.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMedicoRepository extends JpaRepository<Medico, Integer> {
}
