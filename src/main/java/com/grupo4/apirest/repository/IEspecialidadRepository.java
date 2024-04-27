package com.grupo4.apirest.repository;

import com.grupo4.apirest.model.db.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEspecialidadRepository extends JpaRepository<Especialidad, Integer> {
}
