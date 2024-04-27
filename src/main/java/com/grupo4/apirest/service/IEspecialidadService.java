package com.grupo4.apirest.service;

import com.grupo4.apirest.model.db.Especialidad;

import java.util.List;

public interface IEspecialidadService {
    List<Especialidad> findAll();
}
