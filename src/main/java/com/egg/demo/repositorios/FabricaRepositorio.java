package com.egg.demo.repositorios;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.egg.demo.entidades.Fabrica;

public interface FabricaRepositorio extends JpaRepository<Fabrica, UUID> {
    
}
