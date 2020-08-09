package br.com.rdevs.avaliacao.repository;

import br.com.rdevs.avaliacao.model.entity.ModuloEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuloRepository extends JpaRepository<ModuloEntity,String> {
}
