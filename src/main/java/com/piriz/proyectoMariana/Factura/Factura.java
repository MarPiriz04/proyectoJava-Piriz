package com.piriz.proyectoMariana.Factura;

import java.util.List;

import com.piriz.proyectoMariana.Cliente.Cliente;
import com.piriz.proyectoMariana.Producto.Producto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Factura {
    @Id
    @GeneratedValue
    private int id;
    
    @ManyToOne
    private Cliente cliente;
    
    @ManyToMany
    private List<Producto> productos;

    private double total;

    // Constructor por defecto
    public Factura() {}

    // Constructor con parámetros
    public Factura(Cliente cliente, List<Producto> productos, double total) {
        this.cliente = cliente;
        this.productos = productos;
        this.total = total;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}