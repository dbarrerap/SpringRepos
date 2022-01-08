package io.github.dbarrerap.photorepos.api;

import io.github.dbarrerap.photorepos.domain.Catalogo;
import io.github.dbarrerap.photorepos.services.CatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/repositorio")
public class CatalogoController {
    @Autowired
    CatalogoService catalogoService;

    @GetMapping("/catalogo")
    public List<Catalogo> findAll() {
        return catalogoService.findAll();
    }
}
