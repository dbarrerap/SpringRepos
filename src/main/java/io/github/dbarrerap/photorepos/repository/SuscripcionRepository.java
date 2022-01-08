package io.github.dbarrerap.photorepos.repository;

import io.github.dbarrerap.photorepos.domain.Suscripcion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuscripcionRepository extends MongoRepository<Suscripcion, String> {
}
