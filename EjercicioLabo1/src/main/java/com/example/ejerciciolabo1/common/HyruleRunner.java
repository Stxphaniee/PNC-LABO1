package com.example.ejerciciolabo1.common;

import com.example.ejerciciolabo1.domain.entity.Material;
import com.example.ejerciciolabo1.service.MaterialService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HyruleRunner implements CommandLineRunner {

    private final MaterialService materialService;

    //Inyeccion por constructor
    public HyruleRunner(MaterialService materialService) {
        this.materialService = materialService;
    }

    @Override
    public void run(String... args) {

        System.out.println("===== CATALOGO HYRULE =====");

        //Mostrar completo
        for (Material material : materialService.obtenerCatalogoCompleto()) {
            System.out.println("[HYRULE-DB] Nombre: " + material.getNombre()
                    + " | Categoria: " + material.getCategoria()
                    + " | Precio: " + (int) material.getPrecioVenta() + " Rupias");
        }

        //ordenados por precio (mayor a menor)
        System.out.println("\n===== ORDENADOS POR PRECIO =====");
        materialService.obtenerTodosOrdenadosPorPrecioDesc()
                .forEach(m -> System.out.println(m.getNombre() + " - " + m.getPrecioVenta()));

        // material mAs caro
        System.out.println("\n===== MATERIAL MAS CARO =====");
        Material caro = materialService.obtenerMaterialMasCaro();
        if (caro != null) {
            System.out.println(caro.getNombre() + " - " + caro.getPrecioVenta());
        }

        //materiales legendarios
        System.out.println("\n===== LEGENDARIOS =====");
        materialService.obtenerLegendarios()
                .forEach(m -> System.out.println(m.getNombre()));

        //ubicaciones sin repetir
        System.out.println("\n===== UBICACIONES =====");
        materialService.obtenerUbicacionesSinRepetir()
                .forEach(System.out::println);
    }
}