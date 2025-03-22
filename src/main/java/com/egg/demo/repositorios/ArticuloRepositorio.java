package com.egg.demo.repositorios;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.egg.demo.entidades.Articulo;

public interface ArticuloRepositorio extends JpaRepository<Articulo, UUID> {
    Optional<Articulo> findByNroArticulo(Integer nroArticulo);

    boolean existsByNroArticulo(Integer nroArticulo);
} 
