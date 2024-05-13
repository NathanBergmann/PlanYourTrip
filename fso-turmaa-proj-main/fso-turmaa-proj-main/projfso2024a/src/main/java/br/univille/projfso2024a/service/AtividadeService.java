package br.univille.projfso2024a.service;

import java.util.List;
import br.univille.projfso2024a.entity.Atividade;

public interface AtividadeService {
    
    void save(Atividade atividade);
    Atividade getById(long id);
    List<Atividade> getAll();
    Atividade delete(long id);
}
