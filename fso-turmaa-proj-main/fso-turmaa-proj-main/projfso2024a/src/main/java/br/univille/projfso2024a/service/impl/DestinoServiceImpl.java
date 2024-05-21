package br.univille.projfso2024a.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projfso2024a.entity.Destino;
import br.univille.projfso2024a.repository.DestinoRepository;
import br.univille.projfso2024a.service.DestinoService;

@Service
public class DestinoServiceImpl
        implements DestinoService {

    @Autowired
    private DestinoRepository repository;

    @Override
    public void save(Destino destino) {
        repository.save(destino);
    }

    @Override
    public Destino getById(long id) {
        return repository.getById(id);
    }

    @Override
    public List<Destino> getAll() {
        return repository.findAll();
    }

    @Override
    public Destino delete(long id) {
        var destino = getById(id);
        repository.deleteById(id);
        return destino;
    }
}
