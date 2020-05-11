/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.composition;

import java.util.Scanner;

/**
 *
 * @author fnqi
 */
public class Main {

    public static void main(String[] args) {
        /*El programa deberá solicitar por teclado 
        los datos del curso y la cantidad de alumnos
        inscriptos al mismo. A continuación debe solicitar 
        todos los datos de los alumnos.
        
         */
        String nombreCurso = "";
        int cantAlu = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del curso: ");
        nombreCurso = sc.next();
        System.out.println("Ingrese la cantidad de alumnos del curso: ");
        cantAlu = sc.nextInt();
        Curso c = new Curso(nombreCurso, cantAlu);

        for (int i = 0; i < cantAlu; i++) {

            System.out.println("Ingrese el nombre del alumno");
            String nombre = sc.next();
            System.out.println("Ingrese el legajo del alumno");
            int legajo = sc.nextInt();
            System.out.println("Ingrese la cantidad de notas");
            int cantNotas = sc.nextInt();

            Alumno a = new Alumno(nombre, legajo, cantNotas);

            for (int j = 0; j < cantNotas; j++) {
                System.out.println("Ingrese la nota nro = " + (j + 1));
                int nota = sc.nextInt();
                a.agregarNotas(nota);
            }
            c.agregarAlumno(a);
            System.out.println("Alumno cargado Correctamente");
        }
        // -----------------------------------------------------------------------
        System.out.println("Listado de Alumnos: " + c.listadoAlumnos());
        System.out.println("Cantidad de Alumnos con prom +8 = " + c.cantAlumnos());
        System.out.println("Promedio General del curso = " + c.getPromedio());

    }

}
