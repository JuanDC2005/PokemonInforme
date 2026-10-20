package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Pokemon {
    private Integer id;
    private String nombre;
    private String tipo;
    private Integer nivel;
    private Integer ps;

    public Pokemon() {
    }

    @Override
    public String toString() {
        return nombre;
    }
}
