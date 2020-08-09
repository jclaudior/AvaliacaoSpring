package br.com.rdevs.avaliacao.service.bo;

import br.com.rdevs.avaliacao.model.dto.ModuloDTO;
import br.com.rdevs.avaliacao.model.entity.ModuloEntity;
import org.springframework.stereotype.Component;

@Component
public class ModuloBO {
    public ModuloDTO parseDTO (ModuloEntity moduloEntity){
        ModuloDTO modulo = new ModuloDTO();
        modulo.setDsNome(moduloEntity.getDsNome());
        modulo.setDsInstrutorTitular(moduloEntity.getDsInstrutorTitular());
        modulo.setDsInstrutorAuxiliar(moduloEntity.getDsInstrutorAuxiliar());
        modulo.setDtInicio(moduloEntity.getDtInicio());

        return modulo;
    }
}
