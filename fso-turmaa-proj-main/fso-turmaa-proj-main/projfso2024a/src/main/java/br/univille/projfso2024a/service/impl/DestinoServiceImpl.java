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
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getById'");
        }

        @Override
        public List<Destino> getAll() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getAll'");
        }

        @Override
        public Destino delete(long id) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'delete'");
        }

}
