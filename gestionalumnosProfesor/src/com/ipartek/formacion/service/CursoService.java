package com.ipartek.formacion.service;

import java.util.List;

import com.ipartek.formacion.pojo.Curso;
import com.ipartek.formacion.pojo.Modulo;

public interface CursoService {
	/*
	 * CRUD --> BBDD
	 */
	public Curso create(Curso curso);
	
	public Curso getById(int codigo);
	
	public void delete(int codigo);
	
	public List<Curso> getAll();
	
	public Curso update(Curso curso);
}
