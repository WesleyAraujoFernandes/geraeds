package br.com.viaapia.geraeds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.viaapia.geraeds.model.TituloEds;
import br.com.viaapia.geraeds.model.enums.TipoBibliografico;

public interface TituloEdsRepository extends JpaRepository<TituloEds, Integer> {
    TituloEds findByIdTituloAndTipo(Integer idTitulo, TipoBibliografico tipoBibliografico);
}
