package com.g98.blog.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Post")
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String titulo;
	private String contenido;
	private String imagen;
	private Date fechaDeCreacion;
	
	@ManyToOne
	private Long idUsuario;
	
	@ManyToOne
	private Long idCategoria;

	
}
