/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.veterinaria;

import java.util.Scanner;

/**
 *
 * @author fnqi
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente[] clientes;
        int cantClientes;
        int acuEdad = 0, contEdad = 0, cAntiguedad = 0;

        System.out.println("Ingrese la cantidad de clientes = ");
        cantClientes = sc.nextInt();
        clientes = new Cliente[cantClientes];

        for (int i = 0; i < cantClientes; i++) {
            System.out.println("Ingrese el nombre del cliente");
            String nombre = sc.next();
            System.out.println("Ingrese el numero del cliente");
            int nro = sc.nextInt();
            System.out.println("Ingrese la antiguedad del cliente");
            int antiguedad = sc.nextInt();
            //-----------------------------------------------------------
            System.out.println("Ingrese el nombre de la mascota");
            String nomMascota = sc.next();
            System.out.println("Ingrese la edad de la mascota");
            int edad = sc.nextInt();
            Mascota m = new Mascota(nombre, edad);
            //-----------------------------------------------------------
            Cliente c = new Cliente(nro, nombre, antiguedad);
            c.unicaMascota(m);
            clientes[i] = c;
        }
        System.out.println("Cantidad de Clientes:" + cantClientes);

        for (Cliente cliente : clientes) {

            acuEdad += cliente.getEdadMascota();
            contEdad++;
            if (cliente.antiguedad5()) {
                cAntiguedad++;
            }

        }

        System.out.println("Promedio edad de las Mascotas:" + acuEdad / contEdad);
        System.out.println("Cantidad de Clientes con antiguedad mayor a 5 años: " + cAntiguedad);

    }

}
