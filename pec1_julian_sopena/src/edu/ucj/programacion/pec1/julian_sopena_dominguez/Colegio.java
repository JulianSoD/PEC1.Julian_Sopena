package edu.ucj.programacion.pec1.julian_sopena_dominguez;


public class Colegio {

private String nombre;
private String direccion;
private static Alumno[][] aulas;

// Constructor Colegio

public Colegio(String nombre, String direccion, int numAulas) {
	super();
	this.nombre = nombre;
	this.direccion = direccion;
	aulas = new Alumno[numAulas][3];//Por que hay 3 asientos por aula
    }

//Getters & Setters

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public Alumno[][] getAulas() {
	return aulas;
}
public void setAulas(Alumno[][] aulas) {
	this.aulas = aulas;
}

//Método asignar asiento

public static void asignarAsiento(Alumno alumno) {
    for (int i=0;i<aulas.length;i++) {
        for (int j=0; j < 3; j++) {
        	if (aulas[i][j] == null) {
        		aulas[i][j] = alumno;
	            System.out.println("El alumno " + alumno.getNombre() + " cuyo DNI es " + alumno.getDni() +
	                                   " tiene asignado al asiento " + (j+1) + " del aula " + (i+1));
	            return;
            }    
        }
    }
    System.out.println("Todas las aulas están llenas, por lo que no cabe el alumno "+alumno.getNombre()+" "+alumno.getApellidos());
}

}