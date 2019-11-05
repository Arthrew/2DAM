package primerproyecto;

import java.util.Scanner;

public class PrimerProyecto {

    public int variable = 1;

    public static void main(String[] args) {

        int nota1 = 5;
        int nota2;

        switch (nota1) {
            case 1:
                nota2 = 1;
                break;
            case 2:
                nota2 = 2;
                break;
            case 3:
                nota2 = 3;
                break;
            case 4:
                nota2 = 4;
                break;
            case 5:
                nota2 = 5;
                break;
            default:
                nota2 = 20;
                break;
        }
        
        System.out.println(nota2);
    
    
    int[] colNumeros = new int[3];
    int[] colNumerosDos = {1,2,3,4,5};
    
    for (int i = 0; i < colNumerosDos.length; i++){
        System.out.println(colNumerosDos[i]);
    }
    
    for (int item : colNumerosDos ){
        System.out.println(item);  
    }
    
    Object[] arrayTipos = {1, false, "hola"};
    
    for (Object item : arrayTipos){
        //(int)item;
    }
    
        System.out.println("El dato del array es:" + arrayTipos[0]);
        System.out.printf(" El dato del array es: %d y es del array %s \n",colNumeros[0],"array numeros");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduce tu nombre:");
        String nombre = scanner.next();
        System.out.println(nombre);
        
        System.out.println("Por favor introduve tu ap:");
        String ap = scanner.next();
        System.out.println(ap);
        
    
    }

}
