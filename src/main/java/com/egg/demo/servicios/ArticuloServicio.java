package com.egg.demo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egg.demo.entidades.Articulo;
import com.egg.demo.repositorios.ArticuloRepositorio;

@Service
public class ArticuloServicio {
    @Autowired
    private ArticuloRepositorio articuloRepositorio;

    public Articulo agregarArticulo(Articulo articulo) {
        return articuloRepositorio.save(articulo);
    }

    public List<Articulo> listarArticulos() {
        return articuloRepositorio.findAll();
    }
    
}
