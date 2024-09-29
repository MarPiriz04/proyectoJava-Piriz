package com.piriz.proyectoMariana.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.piriz.proyectoMariana.Producto.Producto;

    @Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {
    // Consultas personalizadas si lo necesitas
}

