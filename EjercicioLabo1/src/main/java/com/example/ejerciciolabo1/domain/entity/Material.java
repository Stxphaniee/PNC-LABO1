
package com.example.ejerciciolabo1.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Material {

    private String nombre;
    private String categoria;
    private String efectoCocina;
    private double precioVenta;
    private String ubicacionPrincipal;
    private String rareza;
}