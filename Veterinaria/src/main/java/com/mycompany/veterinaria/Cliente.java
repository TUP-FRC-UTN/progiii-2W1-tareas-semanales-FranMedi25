/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.veterinaria;

/**
 *
 * @author fnqi
 */
public class Cliente {

    private int nroCliente;
    private String nombre;
    private int antiguedad;
    private Mascota m;

    public int getNroCliente() {
        return nroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Cliente(int nroCliente, String nombre, int antiguedad) {
        this.nroCliente = nroCliente;
        this.nombre = nombre;
        this.antiguedad = antiguedad;

    }

    public void unicaMascota(Mascota m) {
        this.m = m;
    }

    public int getEdadMascota() {
        return m.getEdad();
    }

    public boolean antiguedad5() {
        boolean antg = false;
        if (antiguedad > 5) {
            antg = true;
        }
        return antg;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nroCliente=" + nroCliente + ", nombre="
                + nombre + ", antiguedad=" + antiguedad + ", nombre de Mascota="
                + m.getNombre() + '}';

    }

}
