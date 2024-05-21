package br.univille.projfso2024a.service;

import java.util.List;
import br.univille.projfso2024a.entity.Destino;

public interface DestinoService {
    void save (Destino destino);
    Destino getById(long id);
    List<Destino> getAll();
    Destino delete (long id);
}
