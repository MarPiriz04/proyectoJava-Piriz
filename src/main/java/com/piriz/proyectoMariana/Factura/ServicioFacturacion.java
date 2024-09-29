package com.piriz.proyectoMariana.Factura;

import java.util.List;

import com.piriz.proyectoMariana.Cliente.Cliente;
import com.piriz.proyectoMariana.Producto.Producto;


public class ServicioFacturacion {

    // Método para crear una factura a partir de un cliente y una lista de productos
    public Factura crearFactura(Cliente cliente, List<Producto> productos) {
        // Calcular el total sumando los precios de los productos
        double total = productos.stream().mapToDouble(Producto::getPrecio).sum();

        // Retornar una nueva factura
        return new Factura(cliente, productos, total);
    }
}