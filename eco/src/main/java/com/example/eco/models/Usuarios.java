package com.example.eco.models;

import javax.persistence.*;

import lombok.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "usuarios")
public class Usuarios {
	public Usuarios() {
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_user")
	private int id_user;
	@Column(name = "nickname")
	private String nickname;
	@Column(name = "password")
	private String password;
	@Column(name = "name")
	private String name;
	@Column(name = "surname")
	private String surname;
	@Column(name = "mail")
	private String mail;
	@Column(name = "type")
	private int type;
	@Column(name = "datetime")
	private String datetime;
	@Column(name = "province")
	private int province;
	
	
}
