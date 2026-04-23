package com.example.ejerciciolabo1.service;

import com.example.ejerciciolabo1.domain.entity.Material;
import com.example.ejerciciolabo1.domain.entity.Rareza;
import com.example.ejerciciolabo1.repository.MaterialRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class MaterialService {

    private final MaterialRepository materialRepository;

    public MaterialService(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    public List<Material> obtenerTodosOrdenadosPorPrecioDesc() {
        return materialRepository.findAll().stream()
                .sorted(Comparator.comparing(Material::getPrecioVenta).reversed())
                .toList();
    }

    public Material obtenerMaterialMasCaro() {
        return materialRepository.findAll().stream()
                .max(Comparator.comparing(Material::getPrecioVenta))
                .orElse(null);
    }

    public List<Material> obtenerLegendarios() {
        return materialRepository.findAll().stream()
                .filter(material -> material.getRareza().equals(Rareza.LEGENDARIO))
                .toList();
    }

    public List<String> obtenerUbicacionesSinRepetir() {
        return materialRepository.findAll().stream()
                .map(Material::getUbicacionPrincipal)
                .distinct()
                .toList();
    }

    public List<Material> obtenerCatalogoCompleto() {
        return materialRepository.findAll();
    }
}