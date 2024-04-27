package com.grupo4.apirest.service;

import com.grupo4.apirest.model.db.Especialidad;
import com.grupo4.apirest.repository.IEspecialidadRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerMapping;

import java.util.List;

@Service
@AllArgsConstructor
public class EspecialidadServiceImpl implements IEspecialidadService {
    private final IEspecialidadRepository especialidadRepository;
    private final HandlerMapping resourceHandlerMapping;

    @Override
    public List<Especialidad> findAll() {
        return especialidadRepository.findAll();
    }
}
