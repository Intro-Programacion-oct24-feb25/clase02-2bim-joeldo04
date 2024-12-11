/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;
import paquete1.*;

/**
 *
 * @author Joel
 */
public class Ejemplo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de elementos");
        int numero_elementos = entrada.nextInt();
        // arreglo de tipo entero
        int nunmero_elementos;
        int[] arreglo1 = new int[15];
        // Se asigna valores al arreglo
        
        System.out.printf("%d\n", arreglo1.length);
        // Se hace uso del ciclo repetitivo for para recorrer el arreglo
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.printf("Subíndice o Índice %d, con valor %d\n",
                    i, arreglo1[i]);
        }
        
    }

}
