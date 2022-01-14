package io.github.dbarrerap.photorepos.repository.postgres;

import io.github.dbarrerap.photorepos.domain.postgres.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotasRepository extends JpaRepository<Nota, Long> {
}
