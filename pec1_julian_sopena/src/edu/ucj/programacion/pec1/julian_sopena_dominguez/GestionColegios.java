package edu.ucj.programacion.pec1.julian_sopena_dominguez;

import java.util.Scanner;

public class GestionColegios {
	public static void colocarAlumnos (Alumno[] alumno,Colegio colegio){
		for (int i=0; i<alumno.length;i++) {
			Colegio.asignarAsiento(alumno[i]);
			if (i > (colegio.getAulas().length)*3) {
				System.out.println("No hay suficientes asientos para todos los alumnos.");
				break;
			}
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
		
