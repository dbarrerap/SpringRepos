package io.github.dbarrerap.photorepos.domain;

import java.io.Serializable;
import lombok.*;
import org.springframework.data.annotation.*;

@Data
public class Catalogo implements Serializable {
    @Id
    private String id;

    private String nombre;
    private String descripcion;
    private double precio;
    private double descuento;
    private int credito;
}
