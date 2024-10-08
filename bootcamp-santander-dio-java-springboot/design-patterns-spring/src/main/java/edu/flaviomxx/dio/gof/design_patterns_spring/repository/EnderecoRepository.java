package edu.flaviomxx.dio.gof.design_patterns_spring.repository;

import edu.flaviomxx.dio.gof.design_patterns_spring.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Long> {
}
