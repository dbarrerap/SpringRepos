package io.github.dbarrerap.photorepos.api;

import io.github.dbarrerap.photorepos.domain.Suscripcion;
import io.github.dbarrerap.photorepos.services.SuscripcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SuscripcionController {
    @Autowired
    SuscripcionService suscripcionService;

    @GetMapping("/suscripcion")
    public List<Suscripcion> findAll() {
        return suscripcionService.findAll();
    }

    @PostMapping("/suscripcion")
    public Suscripcion save(@RequestBody Suscripcion suscripcion) {
        return suscripcionService.save(suscripcion);
    }

    @GetMapping("/suscripcion/{id}")
    public Suscripcion findById(@PathVariable String id) {
        return suscripcionService.findById(id);
    }

    @DeleteMapping("/suscripcion/{id}")
    public void delete(@PathVariable String id) {
        suscripcionService.delete(id);
    }
}
