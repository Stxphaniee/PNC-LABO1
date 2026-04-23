package com.example.ejerciciolabo1.repository;

import com.example.ejerciciolabo1.domain.entity.Categoria;
import com.example.ejerciciolabo1.domain.entity.EfectoCocina;
import com.example.ejerciciolabo1.domain.entity.Material;
import com.example.ejerciciolabo1.domain.entity.Rareza;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MaterialRepository {

    private final List<Material> materiales;

    public MaterialRepository() {
        this.materiales = List.of(
                Material.builder()
                        .nombre("Ambar Rojo")
                        .categoria(Categoria.MINERAL)
                        .efectoCocina(EfectoCocina.DEFENSA)
                        .precioVenta(30)
                        .ubicacionPrincipal("Cordillera de Hebra")
                        .rareza(Rareza.RARO)
                        .build(),

                Material.builder()
                        .nombre("Ala de Keese")
                        .categoria(Categoria.PARTE_DE_MONSTRUO)
                        .efectoCocina(EfectoCocina.SIGILO)
                        .precioVenta(15)
                        .ubicacionPrincipal("Pradera de Hyrule")
                        .rareza(Rareza.COMUN)
                        .build(),

                Material.builder()
                        .nombre("Pimienta ardiente")
                        .categoria(Categoria.PLANTA)
                        .efectoCocina(EfectoCocina.ATAQUE)
                        .precioVenta(10)
                        .ubicacionPrincipal("Cordillera de Hebra")
                        .rareza(Rareza.COMUN)
                        .build(),

                Material.builder()
                        .nombre("Trufa vigorosa")
                        .categoria(Categoria.COMIDA)
                        .efectoCocina(EfectoCocina.ESTAMINA)
                        .precioVenta(45)
                        .ubicacionPrincipal("Bosque Farone")
                        .rareza(Rareza.POCO_COMUN)
                        .build(),

                Material.builder()
                        .nombre("Escama de Dragón")
                        .categoria(Categoria.PARTE_DE_MONSTRUO)
                        .efectoCocina(EfectoCocina.CORAZONES)
                        .precioVenta(300)
                        .ubicacionPrincipal("Monte Lanayru")
                        .rareza(Rareza.LEGENDARIO)
                        .build(),

                Material.builder()
                        .nombre("Diamante")
                        .categoria(Categoria.MINERAL)
                        .efectoCocina(EfectoCocina.DEFENSA)
                        .precioVenta(500)
                        .ubicacionPrincipal("volcan de Eldin")
                        .rareza(Rareza.LEGENDARIO)
                        .build()
        );
    }

    public List<Material> findAll() {
        return materiales;
    }
}