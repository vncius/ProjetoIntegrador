package com.monitoria.puc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.monitoria.puc.model.ModelDisciplina;

@Repository
public interface RepositoryDisciplina extends CrudRepository<ModelDisciplina, Long> {

}
