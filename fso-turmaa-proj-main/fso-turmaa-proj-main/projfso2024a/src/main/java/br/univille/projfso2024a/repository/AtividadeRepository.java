package br.univille.projfso2024a.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.univille.projfso2024a.entity.Atividade;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Long>{
    
}
