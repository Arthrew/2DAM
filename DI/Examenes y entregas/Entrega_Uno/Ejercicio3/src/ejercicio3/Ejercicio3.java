package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = sc.next();
        boolean jugar = true;
        int num, adivinar;
        int contador = 0;
        String vuelta;
        int record = 999;
        do {
            num = (int) (Math.random() * 20);
            do {
                System.out.println("Prueba a adivinar el numero: ");
                adivinar = sc.nextInt();
                contador++;
            } while (adivinar != num);
            System.out.printf("\n Enhorabuena %s has acertado en %d intentos \n", nombre, contador);
            if (contador < record) {
                System.out.println(" Has superado el record!!!!!!");
                record = contador;
            } else {
                System.out.println(" No has superado el record, intentalo de nuevo");
            }
            System.out.println(" ¿Quieres volver a jugar?(s/n):");
            vuelta = sc.next();
            if (!vuelta.toLowerCase().equals("s")) {
                jugar = false;
            } else {
                contador = 0;
            }
        } while (jugar);
    }

}
