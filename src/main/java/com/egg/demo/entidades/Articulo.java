package com.egg.demo.entidades;
import lombok.Data;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "articulos")
public class Articulo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idArticulo;

    @Column(unique = true, nullable = false)
    private Integer nroArticulo;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private double precio;

    @ManyToOne
    @JoinColumn(name = "id_fabrica", nullable = false)
    private Fabrica fabrica;

    private static final AtomicInteger contador = new AtomicInteger(0);

    @PrePersist
    public void generarNroArticulo(){
        this.nroArticulo = contador.incrementAndGet();
    }
}
