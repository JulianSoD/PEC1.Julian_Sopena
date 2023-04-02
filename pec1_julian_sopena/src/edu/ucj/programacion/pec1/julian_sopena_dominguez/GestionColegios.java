package edu.ucj.programacion.pec1.julian_sopena_dominguez;

import java.util.Scanner;

public class GestionColegios {
	public static void colocarAlumnos (Alumno[] alumno,Colegio colegio){
		for (int i=0; i<alumno.length;i++) {
			Colegio.asignarAsiento(alumno[i]); // Entiendo que al pedir: por cada objeto Alumno que recibe 
							   // el método se debe asignar al primer asiento libre que tenga cualquiera de las aulas
							   // quiere utilizar el método asignarAlumno que hemos creado
		}
	}	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el nombre del colegio: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce la dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Introduce el número de aulas: ");
        int numAulas = scanner.nextInt();
        System.out.print("Introduce el número de alumnos: ");
        int numAlumnos = scanner.nextInt();
		
		Colegio colegio1 = new Colegio(nombre,direccion,numAulas);
		Alumno[] alumnos = UtilsColegio.datosAlumno(numAlumnos);
		
		colocarAlumnos(alumnos,colegio1);
		
		scanner.close();
	}	
}
		
