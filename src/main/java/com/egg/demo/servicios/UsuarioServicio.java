package com.egg.demo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egg.demo.entidades.Usuario;
import com.egg.demo.repositorios.UsuarioRepositorio;

@Service
public class UsuarioServicio {
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    public Usuario registrarUsuario(Usuario usuario){
        if (usuarioRepositorio.existsByEmail(usuario.getEmail())){
            throw new RuntimeException("El email ya está registrado.");
        }
        return usuarioRepositorio.save(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return usuarioRepositorio.findAll();
    }
}
