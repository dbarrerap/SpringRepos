package io.github.dbarrerap.photorepos.repository;

import io.github.dbarrerap.photorepos.domain.Catalogo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogoRepository extends MongoRepository<Catalogo, String> {
}
