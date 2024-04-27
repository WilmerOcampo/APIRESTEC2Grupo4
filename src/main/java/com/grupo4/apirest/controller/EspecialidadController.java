package com.grupo4.apirest.controller;

import com.grupo4.apirest.model.db.Especialidad;
import com.grupo4.apirest.service.IEspecialidadService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping(path = "api/v1/grupo4/especialidad")
public class EspecialidadController {
    private final IEspecialidadService especialidadService;

    @GetMapping("/list")
    public ResponseEntity<List<Especialidad>> listarMedicos() {
        List<Especialidad> especialidades = especialidadService.findAll();
        return ResponseEntity.ok(especialidades);
    }
}
