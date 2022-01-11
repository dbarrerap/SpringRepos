package io.github.dbarrerap.photorepos.services;

import io.github.dbarrerap.photorepos.repository.CatalogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ScheduledTaskService {

    @Autowired
    CatalogoRepository catalogoRepository;

    @Scheduled(cron = "0/15 * * * * *")
    public void activate() {
        long count = catalogoRepository.count();
        System.out.println("Scheduled Task count: " + count);

        HashMap<String, Object> response = new HashMap<>();
        response.put("message", "Scheduled Task ready");
    }

    @Scheduled(cron = "0/30 * * * * *")
    public void deleteByName() {
        System.out.println("Buscando registros...");
        catalogoRepository.findAllByNombre("Nombre").forEach(catalogo -> delete(catalogo.getId()));
    }

//    @Scheduled(cron = "0/60 * * * * *")
//    public void deleteNoName() {
//        System.out.println("Eliminando registros...");
//        catalogoRepository.findAllByNombreIsNull().forEach(catalogo -> {
//            delete(catalogo.getId());
//        });
//    }

    public void delete(String id) {
        System.out.println("ELIMINANDO: " + id);
        catalogoRepository.deleteById(id);
    }
}
