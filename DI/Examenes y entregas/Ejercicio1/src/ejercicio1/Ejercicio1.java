package ejercicio1;

import java.util.Calendar;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor introduce tu nombre:");
        String nombre = scanner.next();
        String moment = "";
        String letra = "";
        boolean vuelta = true;

        do {
            int hora = Calendar.getInstance().get(Calendar.HOUR);
            int min = Calendar.getInstance().get(Calendar.MINUTE);
            int dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
            int mes = Calendar.getInstance().get(Calendar.MONTH);
            int ano = Calendar.getInstance().get(Calendar.YEAR);

            switch (hora) {

                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    moment = "noches";
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    moment = "dias";
                    break;
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                    moment = "tardes";
                    break;
                case 21:
                case 22:
                case 23:
                case 24:
                    moment = "noches";
                    break;

            }
            System.out.printf("Buenos %s %s, Son las %d:%d del %d de %d de %d \n", moment, nombre, hora, min, dia, mes + 1, ano);

            System.out.println("¿Quieres volver a comprobar la hora?(S/N):");
            letra = scanner.next();
            scanner.nextLine();
            if (letra.toLowerCase().equals("s")) {
            } else {
                break;
            }

        } while (true);

    }

}
