package io.github.dbarrerap.photorepos.api;

import io.github.dbarrerap.photorepos.domain.postgres.Nota;
import io.github.dbarrerap.photorepos.repository.postgres.NotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/postgres")
public class NotasController {
    @Autowired
    private final NotasRepository notasRepository;

    public NotasController(NotasRepository repository) {
        notasRepository = repository;
    }

    @GetMapping("/notas")
    public List<Nota> findAll() {
        return notasRepository.findAll();
    }

    @PostMapping("/notas")
    public Nota store(@RequestBody Nota nota) {
        return notasRepository.save(nota);
    }
}
