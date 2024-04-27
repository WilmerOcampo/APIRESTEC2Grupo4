package com.grupo4.apirest.service;

import com.grupo4.apirest.model.db.Medico;
import com.grupo4.apirest.repository.IMedicoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MedicoServiceImpl implements IMedicoService {
    private final IMedicoRepository medicoRepository;

    @Override
    public List<Medico> findAll() {
        return medicoRepository.findAll();
    }
}
