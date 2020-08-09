package br.com.rdevs.avaliacao.controller;

import br.com.rdevs.avaliacao.model.dto.ModuloDTO;
import br.com.rdevs.avaliacao.service.ModuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Provider;
import java.util.List;

@RestController
public class ModuloController {

    @Autowired
    ModuloService service;

    @GetMapping("/")
    public List<ModuloDTO> mostrarModulos(){
        return service.listar();
    }
}
