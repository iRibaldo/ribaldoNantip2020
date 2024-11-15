/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.sistemasolar;

import ec.edu.espoch.sistemasolar.clases.Planeta;
import ec.edu.espoch.sistemasolar.enumeracion.TipoPlaneta;

public class SistemaSolar {

    public static void main(String[] args) {
        

        Planeta objPlaneta = new Planeta("Tierra",1,454.6,88678.54,546543.6,1324234,TipoPlaneta.TERRESTRE);
        
        /*
        objPlaneta.nombre = "Marte";
        objPlaneta.masaKilimetro = 0;
        objPlaneta.cantidadSatelite = 0;
        objPlaneta.volumen = 0;
        objPlaneta.diametroKilometro = 0;
        objPlaneta.distanciaSol = 0;
        objPlaneta.tipoPlaneta = TipoPlaneta.GASEOSO;
        */
        objPlaneta.imprimir();
        
        double densidad = objPlaneta.calcularDensidadPlaneta();
        System.out.println("La desnidad del planeta es:" + densidad);
        

    }
}
