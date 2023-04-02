package edu.ucj.programacion.pec1.julian_sopena_dominguez;

public class Aula {

private int numero;
private int planta;
private int asientos;

//Constructor Aula

public Aula(int numero, int planta, int asientos) {
	super();
	this.numero = numero;
	this.planta = planta;
	this.asientos = asientos;
}

//Getters & Setters

public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public int getPlanta() {
	return planta;
}
public void setPlanta(int planta) {
	this.planta = planta;
}
public int getAsientos() {
	return asientos;
}
public void setAsientos(int asientos) {
	this.asientos = asientos;
}

}