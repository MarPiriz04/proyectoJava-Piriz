package com.piriz.proyectoMariana.Servicios;


import com.piriz.proyectoMariana.Factura.Factura;
import com.piriz.proyectoMariana.repositories.FacturaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaServicio {

    @Autowired
    private FacturaRepositorio facturaRepositorio;

    // Guardar una factura
    public Factura guardarFactura(Factura factura) {
        return facturaRepositorio.save(factura);
    }

    // Obtener una factura por ID
    public Factura obtenerFactura(int id) {
        return facturaRepositorio.findById(id).orElse(null);
    }
}
