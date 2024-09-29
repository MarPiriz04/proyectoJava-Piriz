package com.piriz.proyectoMariana.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.piriz.proyectoMariana.Cliente.Cliente;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {
    // Puedes agregar consultas personalizadas si lo necesitas
}
