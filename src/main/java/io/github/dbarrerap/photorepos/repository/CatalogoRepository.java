package io.github.dbarrerap.photorepos.repository;

import io.github.dbarrerap.photorepos.domain.Catalogo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatalogoRepository extends MongoRepository<Catalogo, String> {
    List<Catalogo> findAllByCreditoIsNull();

    List<Catalogo> findAllByNombreIsNull();

    List<Catalogo> findAllByNombre(String nombre);

    @Query("{ $and [{'precio' : ?0}] }")
    List<Catalogo> findAllByPrecio(double precio);

    // List<Catalogo> findAllByNombreOrPRecio(String nombre, double precio);
}
