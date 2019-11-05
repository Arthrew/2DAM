/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Usuario DAM 2
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Double> temperaturas = new ArrayList<Double>();
        boolean salir = true;
        int opcion;
        Double temp;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Introducir temperaturas");
            System.out.println("2. Mostrar temperaturas");
            System.out.println("3. Ordenar temperaturas");
            System.out.println("4. Mostrar extremos");
            System.out.println("5. Mostrar medias");
            System.out.println("6. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce la temperatura deseada:");
                    temp = sc.nextDouble();
                    temperaturas.add(temp);
                    break;
                case 2:
                    System.out.println("");
                    for (int x = 0; x < temperaturas.size(); x++ ){
                        System.out.println((x+1) + ". " + temperaturas.get(x) + " ªC");
                    }
                    System.out.println("");
                    break;
                case 3:
                    Collections.sort(temperaturas);
                    break;
                case 4:
                    System.out.println("La temperatura maxima es " + Collections.max(temperaturas));
                    System.out.println("La temperatura minima es " + Collections.min(temperaturas));
                    break;
                case 5:
                    
                    break;
                case 6:
                    salir = false;
                    break;
            }

        } while (salir);
    }

}
