/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.composition;

/**
 *
 * @author fnqi
 */
public class Curso {

    private String nombre;
    private Alumno[] alumnos;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Curso(String nombre, int cantidad) {
        this.nombre = nombre;
        this.alumnos = new Alumno[cantidad];

    }

    public void agregarAlumno(Alumno nuevo) {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] == null) {
                alumnos[i] = nuevo;
                break;
            }
        }
    }

    public String listadoAlumnos() {
        String listado = "";
        for (Alumno a : alumnos) {
            if (a != null) {
                listado += a.toString() + "\n";

            }
        }
        return listado;
    }

    public float getPromedio() {
        int c = 0;
        float suma = 0f;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null) {
                suma += alumnos[i].getPromedio();
                c++;
            }
        }
        return (float) (suma / c);
    }

    public int cantAlumnos() {
        int c = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null && alumnos[i].getPromedio() > 8) {
                c++;
            }
        }
        return c;
    }

}
