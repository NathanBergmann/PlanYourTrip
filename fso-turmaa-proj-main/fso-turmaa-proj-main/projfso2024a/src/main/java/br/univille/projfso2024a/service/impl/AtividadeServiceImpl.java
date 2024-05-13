package br.univille.projfso2024a.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projfso2024a.entity.Atividade;
import br.univille.projfso2024a.repository.AtividadeRepository;
import br.univille.projfso2024a.service.AtividadeService;

@Service
public class AtividadeServiceImpl implements AtividadeService {

    @Autowired
    private AtividadeRepository repository;

    @Override
    public void save(Atividade atividade) {
        repository.save(atividade);
    }

    @Override
    public Atividade getById(long id) {
        return repository.getById(id);
    }

    @Override
    public List<Atividade> getAll() {
        return repository.findAll();
    }

    @Override
    public Atividade delete(long id) {
        var atividade = getById(id);
        repository.deleteById(id);
        return atividade;
    }
}
