package edu.ucj.programacion.pec1.julian_sopena_dominguez;

import java.util.Scanner;

public class UtilsColegio {

public static Alumno[] datosAlumno(int numAlumnos) {
	Scanner scanner = new Scanner(System.in); 
	Alumno[] todosAlumnos = new Alumno[numAlumnos];
	for (int i=0; i<numAlumnos;i++) {
		System.out.print("Introduce el nombre del alumno: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce los apellidos del alumno: ");
        String apellidos = scanner.nextLine();
        System.out.print("Introduce el dni del alumno: ");
        String dni = scanner.nextLine(); 
        todosAlumnos[i] = new Alumno(nombre,apellidos,dni);
	}
	scanner.close();
	return todosAlumnos;
}
	
}
