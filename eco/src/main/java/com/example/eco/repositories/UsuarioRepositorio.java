package com.example.eco.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eco.models.Usuarios;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuarios, Long> {

	void save(Optional<Usuarios> UsuarioToUpdate);
	/*
	 * void registrar(Usuarios usuario); List<Usuarios> getUsuarios(); void
	 * eliminar(Long id); List<Usuarios> findbyId();
	 * 
	 */
}
