package com.piriz.proyectoMariana.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.piriz.proyectoMariana.Factura.Factura;

@Repository
public interface FacturaRepositorio extends JpaRepository<Factura, Integer> {
    // Consultas personalizadas si lo necesitas
}