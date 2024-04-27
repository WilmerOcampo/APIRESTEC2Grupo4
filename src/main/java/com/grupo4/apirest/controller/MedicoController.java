package com.grupo4.apirest.controller;

import com.grupo4.apirest.model.db.Medico;
import com.grupo4.apirest.service.IMedicoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping(path = "api/v1/grupo4/medico")
public class MedicoController {
    private final IMedicoService medicoService;

    @GetMapping("/list")
    public ResponseEntity<List<Medico>> listarMedicos() {
        List<Medico> medicos = medicoService.findAll();
        return ResponseEntity.ok(medicos);
    }
}
