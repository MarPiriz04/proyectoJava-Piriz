package com.piriz.proyectoMariana.Servicios;

import com.piriz.proyectoMariana.Cliente.Cliente;
import com.piriz.proyectoMariana.repositories.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServicio {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    // Guardar un nuevo cliente en la base de datos
    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepositorio.save(cliente);
    }

    // Obtener todos los clientes desde la base de datos
    public List<Cliente> obtenerClientes() {
        return clienteRepositorio.findAll();
    }

    // Buscar un cliente por ID
    public Cliente obtenerClientePorId(int id) {
        return clienteRepositorio.findById(id).orElse(null);
    }

    // Eliminar un cliente por ID
    public void eliminarCliente(int id) {
        clienteRepositorio.deleteById(id);
    }
}
