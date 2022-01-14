package io.github.dbarrerap.photorepos.domain.postgres;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name = "db_notas")
@Entity
public class Nota implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    @CreationTimestamp
    @Column(name = "fecha_creacion")
    private Date created_at;
    @ManyToOne
    private User user;
}
