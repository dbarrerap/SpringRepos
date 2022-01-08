package io.github.dbarrerap.photorepos.services;

import io.github.dbarrerap.photorepos.domain.Suscripcion;
import io.github.dbarrerap.photorepos.repository.SuscripcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SuscripcionService {
    @Autowired
    SuscripcionRepository suscripcionRepository;

    public List<Suscripcion> findAll() {
        return suscripcionRepository.findAll();
    }

    public Suscripcion findById(String id) {
        Optional<Suscripcion> optionalSuscripcion = suscripcionRepository.findById(id);
        return optionalSuscripcion.isEmpty() ? null : optionalSuscripcion.get();
    }

    public Suscripcion save(Suscripcion suscripcion) {
        return suscripcionRepository.save(suscripcion);
    }

    public void delete(String id) {
        suscripcionRepository.deleteById(id);
    }
}
