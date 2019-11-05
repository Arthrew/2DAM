package ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] posiciones = new int[50];
        int opcion;
        String cambio;
        boolean vuelta = true;

        do {
            System.out.println("----Menu----");
            System.out.println("1.Rellenar");
            System.out.println("2.Listar");
            System.out.println("3.Ordenar");
            System.out.println("4.Vaciar");
            System.out.println("5.Salir");
            System.out.println("------------");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    for (int x = 0; x < 50; x++) {
                        if (posiciones[x] == 0) {
                            posiciones[x] = (int) (Math.random() * 200);
                        } else {

                            System.out.println("¿Confirmar cambio?(s/n):");
                            cambio = sc.next();
                            if (cambio.toLowerCase().equals("s")) {
                                posiciones[x] = (int) (Math.random() * 200);
                            } else {
                            }
                        }
                    }
                    System.out.println("Array modificado");
                    break;
                case 2:
                    for (int x = 0; x < 50; x++) {
                        System.out.println("Elemento " + (x + 1) + ". " + posiciones[x]);
                    }
                    break;
                case 3:
                    Arrays.sort(posiciones);
                    System.out.println("Array Ordenado");
                    break;
                case 4:
                    for (int x = 0; x < 50; x++) {
                        posiciones[x] = 0;
                    }
                    System.out.println("Array vaciado");
                    break;
                case 5:
                    System.out.println("Hasta la vista");
                    vuelta = false;
                    break;
                default:
                    break;
            }

        } while (vuelta);
    }

}
