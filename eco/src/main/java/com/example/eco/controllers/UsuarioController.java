package com.example.eco.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.eco.UsuarioServices.UsuarioService;
import com.example.eco.models.Usuarios;

@RestController
public class UsuarioController {
	
	 @Autowired
	 private UsuarioService usuarioService;
	 
	 
		@RequestMapping(value = "/customers", method = RequestMethod.GET, produces = "application/json")
		public List<Usuarios> getUsuarios() {
			return usuarioService.findAllUsers();
		}
		
		@GetMapping("/customers2")
		public List<Usuarios> getUsuarios2() {
			return usuarioService.findAllUsers();
		}
	 
	 
//	
//	  @GetMapping("/algo")
//	    public String
//	    //List<Usuarios> 
//	    getUsuarios() {
//		  //List<Usuarios> usersList = new List<Usuarios>();
//		 
//	        return "alga";
//	    }
//	  
//	  @PostMapping("/usuarios/4/delete")
//	  public void DeleteUsuarios(@PathVariable Long id) {
//		  usuarioRepositorioImpl.eliminar(4L);
//	  }
//	  @GetMapping("/nose")
//	  @ResponseBody
//	  public String ejemplo() {
//		  return "eres un payaso";
//	  }

}
