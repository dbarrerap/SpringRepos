package io.github.dbarrerap.photorepos.api;

import io.github.dbarrerap.photorepos.domain.Catalogo;
import io.github.dbarrerap.photorepos.services.CatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CatalogoController {
    @Autowired
    CatalogoService catalogoService;

    @GetMapping("/catalogo")
    public List<Catalogo> findAll() {
        return catalogoService.findAll();
    }

    @GetMapping("/catalogo/{id}")
    public Catalogo findById(@PathVariable String id) {
        return catalogoService.find(id);
    }

    @PostMapping("/catalogo")
    public Catalogo save(@RequestBody Catalogo catalogo) {
        return catalogoService.save(catalogo);
    }

    @DeleteMapping("/catalogo/{id}")
    public void delete(@PathVariable String id) {
        catalogoService.delete(id);
    }
}
