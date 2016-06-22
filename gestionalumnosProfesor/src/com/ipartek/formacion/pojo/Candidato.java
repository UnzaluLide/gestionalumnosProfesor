package com.ipartek.formacion.pojo;

import java.util.Date;

/**
 * 
 * @author va00
 *
 */
public class Candidato {
	public static final int CODIGO_ALUMNO = -1;
	Integer numero;
	
	int n1;
	/**
	 * 
	 */
	private int codigo;
	/**
	 * 
	 */
	private String nombre;
	private String apellidos;
	private Date fNacimiento;
	private String dni;
	private Double nota;
	/**
	 * 
	 */
	public Candidato() {
		super();
		setCodigo(CODIGO_ALUMNO);
		setNombre("");
		setApellidos("");
		setDni("");
		setfNacimiento(new Date());
		setNota(0.0);

	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Date getfNacimiento() {
		return fNacimiento;
	}
	public void setfNacimiento(Date fNacimiento) {
		this.fNacimiento = fNacimiento;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}


	public Double getNota() {
		return nota;
	}


	public void setNota(Double nota) {
		this.nota = nota;
	}

	protected String mostrarDatos(){
		return this.apellidos +", "+ this.nombre;
	}
	
	
	
	
	
	
	
}
