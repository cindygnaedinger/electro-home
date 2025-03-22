package com.egg.demo.entidades;
import lombok.Data;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "fabricas")
public class Fabrica {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idFabrica;

    @Column(nullable = false)
    private String nombre;
    
}
