package io.github.dbarrerap.photorepos.services;

import io.github.dbarrerap.photorepos.domain.Catalogo;
import io.github.dbarrerap.photorepos.repository.CatalogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatalogoService {
    @Autowired
    CatalogoRepository catalogoRepository;

    public List<Catalogo> findAll() {
        return catalogoRepository.findAll();
    }

    public Catalogo save(Catalogo catalogo) {
        return catalogoRepository.save(catalogo);
    }

    public Catalogo update(Catalogo catalogo) {
        return catalogoRepository.save(catalogo);
    }

    public Catalogo find(String id) {
        Optional<Catalogo> catalogoOptional = catalogoRepository.findById(id);

        return catalogoOptional.isEmpty() ? null : catalogoOptional.get();
    }

    public void delete(String id) {
        catalogoRepository.deleteById(id);
    }
}
