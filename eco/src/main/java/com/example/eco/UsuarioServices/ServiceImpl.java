package com.example.eco.UsuarioServices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eco.models.Usuarios;
import com.example.eco.repositories.UsuarioRepositorio;

@Service
public class ServiceImpl implements UsuarioService{
	@Autowired
	UsuarioRepositorio usuarioRepositorio;

	@Override
	public List<Usuarios> findAllUsers() {
		return usuarioRepositorio.findAll();
	}

	@Override
	public Optional<Usuarios> findbyId(Long id) {
		return usuarioRepositorio.findById(id);
	}

	@Override
	public Usuarios saveUsuario(Usuarios usuarioNuevo) {
		if (usuarioNuevo != null) {
			return usuarioRepositorio.save(usuarioNuevo);
		}
		return usuarioNuevo;
	}

	@Override
	public String deleteUsuarios(Long id) {
		
		if (usuarioRepositorio.findById(id).isPresent()) {
			usuarioRepositorio.deleteById(id);
			return "Usuario eliminado correctamente.";
		}
		return "Error! El usuario no existe";
	}

	@Override
	public String updateUsuarios(Usuarios usuarioCambiado) {
		long num = usuarioCambiado.getId_user();
		if(usuarioRepositorio.findById(num).isPresent()) {
			Usuarios usuariosParaCambiar = new Usuarios();
			usuariosParaCambiar.setId_user(usuarioCambiado.getId_user());
			usuariosParaCambiar.setDatetime(usuarioCambiado.getDatetime());
			usuariosParaCambiar.setMail(usuarioCambiado.getMail());
			usuariosParaCambiar.setName(usuarioCambiado.getName());
			usuariosParaCambiar.setNickname(usuarioCambiado.getNickname());
			usuariosParaCambiar.setPassword(usuarioCambiado.getPassword());
			usuariosParaCambiar.setProvince(usuarioCambiado.getProvince());
			usuariosParaCambiar.setSurname(usuarioCambiado.getSurname());
			usuariosParaCambiar.setType(usuarioCambiado.getType());
			return "Success!";
		}
		return "Failed";
	}

}
