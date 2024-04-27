package com.grupo4.apirest.service;

import com.grupo4.apirest.model.db.Medico;

import java.util.List;

public interface IMedicoService {
    List<Medico> findAll();
}
