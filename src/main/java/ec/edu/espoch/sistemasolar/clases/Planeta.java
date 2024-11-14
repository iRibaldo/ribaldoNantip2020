/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sistemasolar.clases;

import ec.edu.espoch.sistemasolar.enumeracion.TipoPlaneta;

/**
 *
 * @author SO-LAB1-PC27
 */
public class Planeta {

    public String nombre;
    public int cantidadSatelite;
    public double masaKilimetro;
    public double volumen;
    public double diametroKilometro;
    public int distanciaSol;
    public TipoPlaneta tipoPlaneta;

    public void imprimir() {
        System.out.println("El nombre del planeta es " + nombre);
        System.out.println("La cantidad de satelites es de " + cantidadSatelite);
        System.out.println("la masa en kilometros es de " + masaKilimetro);
        System.out.println("el volumen es" + volumen);
        System.out.println("El diametro en kilometros es " + diametroKilometro);
        System.out.println("la distancia al sol es de " + distanciaSol);
        System.out.println("El tipo de planeta es " + tipoPlaneta);

    }

    public double calcularDensidadPlaneta() {
        return masaKilimetro/volumen;
    }

}
