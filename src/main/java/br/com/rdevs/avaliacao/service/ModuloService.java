package br.com.rdevs.avaliacao.service;

import br.com.rdevs.avaliacao.model.dto.ModuloDTO;
import br.com.rdevs.avaliacao.model.entity.ModuloEntity;
import br.com.rdevs.avaliacao.repository.ModuloRepository;
import br.com.rdevs.avaliacao.service.bo.ModuloBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ModuloService {

    @Autowired
    ModuloRepository repository;

    @Autowired
    ModuloBO bo;

    public List<ModuloDTO> listar (){
        List<ModuloEntity> modulos = repository.findAll();
        List<ModuloDTO> moduloDTO = new ArrayList<ModuloDTO>();
        for (ModuloEntity modulo: modulos) {
            moduloDTO.add(bo.parseDTO(modulo));
        }
        return moduloDTO;
    }
}
