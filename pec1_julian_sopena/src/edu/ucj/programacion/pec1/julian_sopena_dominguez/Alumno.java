package edu.ucj.programacion.pec1.julian_sopena_dominguez;

public class Alumno {

private String nombre;
private String apellidos;
private String dni;

//Constructor Alumno

public Alumno(String nombre, String apellidos, String dni) {
	super();
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.dni = dni;
}

//Getters & Setters

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
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}



}
