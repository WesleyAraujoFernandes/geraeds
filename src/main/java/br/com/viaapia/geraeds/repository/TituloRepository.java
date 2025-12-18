package br.com.viaapia.geraeds.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.viaapia.geraeds.model.Titulo;

public interface TituloRepository extends JpaRepository<Titulo, Integer> {

    List<Titulo> findByIdTituloIn(List<Integer> ids);
}
