package io.github.dbarrerap.photorepos.domain.postgres;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "db_roles")
@Data
public class Role implements Serializable {
    private static final Long serialVersion = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Boolean status;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}
