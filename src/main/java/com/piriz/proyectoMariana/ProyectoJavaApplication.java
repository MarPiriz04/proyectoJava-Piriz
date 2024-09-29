package com.piriz.proyectoMariana;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.piriz.proyectoMariana.Cliente.Cliente;
import com.piriz.proyectoMariana.Factura.Factura;
import com.piriz.proyectoMariana.Producto.Producto;
import com.piriz.proyectoMariana.Servicios.ClienteServicio;
import com.piriz.proyectoMariana.Servicios.FacturaServicio;
import com.piriz.proyectoMariana.Servicios.ProductoServicio;

import java.util.Arrays;

@SpringBootApplication
public class ProyectoJavaApplication implements CommandLineRunner {

    @Autowired
    private ClienteServicio clienteServicio;

    @Autowired
    private ProductoServicio productoServicio;

    @Autowired
    private FacturaServicio facturaServicio;

    public static void main(String[] args) {
        SpringApplication.run(ProyectoJavaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Crear clientes
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Mariana");
        cliente1.setEmail("mariana@example.com");

        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Juan");
        cliente2.setEmail("juan@example.com");

        // Guardar clientes en la base de datos
        clienteServicio.guardarCliente(cliente1);
        clienteServicio.guardarCliente(cliente2);

        // Crear productos
        Producto producto1 = new Producto();
        producto1.setNombre("Laptop");
        producto1.setPrecio(800.00);

        Producto producto2 = new Producto();
        producto2.setNombre("Mouse");
        producto2.setPrecio(20.00);

        // Guardar productos en la base de datos
        productoServicio.guardarProducto(producto1);
        productoServicio.guardarProducto(producto2);

        // Crear factura para cliente1
        Factura factura1 = new Factura();
        factura1.setCliente(cliente1);
        factura1.setProductos(Arrays.asList(producto1, producto2));
        factura1.setTotal(producto1.getPrecio() + producto2.getPrecio());

        // Guardar factura en la base de datos
        facturaServicio.guardarFactura(factura1);

        // Consultar y mostrar datos
        Factura facturaGuardada = facturaServicio.obtenerFactura(factura1.getId());
        System.out.println("Factura creada para cliente: " + facturaGuardada.getCliente().getNombre());
        System.out.println("Total: " + facturaGuardada.getTotal());
    }
}
