package io.github.dbarrerap.photorepos.domain;

import java.io.Serializable;
import lombok.*;
import org.springframework.data.annotation.*;

@Data
public class Catalogo implements Serializable {
    @Id
    private String id;

    private String nombre;
    private double precio;
    private double descuento;

}
