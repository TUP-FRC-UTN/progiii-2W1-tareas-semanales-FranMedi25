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
public class Alumno {

    private String nombre;
    private int legajo;
    private int[] notas;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }

    public Alumno(String nombre, int legajo, int cantNotas) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.notas = new int[cantNotas];
        for (int i = 0; i < cantNotas; i++) {
            this.notas[i] = -1;
        }
    }

    public void agregarNotas(int nota) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == -1) {
                notas[i] = nota;
                break;
            }
        }
    }

    public float getPromedio() {
        float promedio = 0f;
        int total = 0, c = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] != -1) {
                total += notas[i];
                c++;

            }

        }
        promedio = (total / c);
        return (float) promedio;

    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", legajo=" + legajo + ", promedio=" + this.getPromedio() + '}';
    }

}
