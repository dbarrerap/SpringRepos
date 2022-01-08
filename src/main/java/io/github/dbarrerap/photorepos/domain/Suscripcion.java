package io.github.dbarrerap.photorepos.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document("subscription")
public class Suscripcion implements Serializable {
    private String id;
    private String catalogoId;
    private String email;
    private String nombre;
    private String apellidos;
    private String direccion;
    private double credito;
}
