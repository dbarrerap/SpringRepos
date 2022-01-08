package io.github.dbarrerap.photorepos.services;

import io.github.dbarrerap.photorepos.domain.Catalogo;
import io.github.dbarrerap.photorepos.repository.CatalogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogoService {
    @Autowired
    CatalogoRepository catalogoRepository;
    public List<Catalogo> findAll() {
        return catalogoRepository.findAll();
    }
}
