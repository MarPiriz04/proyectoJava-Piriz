package com.piriz.proyectoMariana.Servicios;

import com.piriz.proyectoMariana.Producto.Producto;
import com.piriz.proyectoMariana.repositories.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicio {

    @Autowired
    private ProductoRepositorio productoRepositorio;

    // Guardar un nuevo producto en la base de datos
    public Producto guardarProducto(Producto producto) {
        return productoRepositorio.save(producto);
    }

    // Obtener todos los productos desde la base de datos
    public List<Producto> obtenerProductos() {
        return productoRepositorio.findAll();
    }

    // Buscar un producto por ID
    public Producto obtenerProductoPorId(int id) {
        return productoRepositorio.findById(id).orElse(null);
    }

    // Eliminar un producto por ID
    public void eliminarProducto(int id) {
        productoRepositorio.deleteById(id);
    }
}
