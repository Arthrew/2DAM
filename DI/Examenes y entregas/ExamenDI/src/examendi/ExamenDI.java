package examendi;

import java.util.Scanner;

public class ExamenDI {

    public static void main(String[] args) {

        boolean PrimerSalir = true;
        int primera;
        Scanner sc = new Scanner(System.in);

        while (PrimerSalir) {
            System.out.println("1.Registrar llamadas locales");
            System.out.println("2.Registrar llamadas nacionales");
            System.out.println("3.Registrar llamadas internacionales");
            System.out.println("4.Mostrar calculo total registrado");
            System.out.println("5.Listar todas las llamadas");
            System.out.println("6.Salir");
            primera = sc.nextInt();

            switch (primera) {
                case 1:
                    System.out.println("Introducir numero de origen:");
                    Float numero_origen = sc.nextFloat();
                    System.out.println("Introducir numero de destino:");
                    Float numero_destino = sc.nextFloat();
                    System.out.println("Introducir duracion llamada(en segundos):");
                    Float duracion = sc.nextFloat();
                    int coste = 0;

                    Llamadas_locales local = new Llamadas_locales(coste, numero_origen, numero_destino, duracion);
                    break;
                case 2:
                    System.out.println("Introducir numero de origen:");
                    numero_origen = sc.nextFloat();
                    System.out.println("Introducir numero de destino:");
                    numero_destino = sc.nextFloat();
                    System.out.println("Introducir duracion llamada(en segundos):");
                    duracion = sc.nextFloat();
                    coste = (int) ((duracion / 60) * (0.2));
                    Llamadas_nacionales nacional = new Llamadas_nacionales(coste, numero_origen, numero_destino, duracion);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;

            }
        }

    }

}
