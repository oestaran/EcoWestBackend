package com.example.eco.UsuarioServices;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.eco.models.Usuarios;

public interface UsuarioService {

	public List<Usuarios> findAllUsers();

	public Optional<Usuarios> findbyId(Long id);

	public Usuarios saveUsuario(Usuarios usuarioNuevo);

	public String deleteUsuarios(Long id);

	public String updateUsuarios(Usuarios UsuarioNuevo);

}
