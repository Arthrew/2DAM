package ticketmaster;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import javax.tools.FileObject;

/**
 *
 * @author Usuario DAM 2
 */
public class TicketMaster {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Artista artista;
        Localidad localidad;
        Recinto recinto;
        TipoEvento tipEvento;
        Evento evento;
        int opcion;
        System.out.println("MENÚ:");
        System.out.println("1. Artistas");
        System.out.println("2. Localidades");
        System.out.println("3. Recintos");
        System.out.println("4. Tipos de evento");
        System.out.println("5. Eventos");
        System.out.println("6. Añadir registro");

        opcion = sc.nextInt();

        switch (opcion) {
            case 1://ARTISTAS
                

                File fichero = new File("src/documentos/artistas.txt");

                FileOutputStream ficheroFile = new FileOutputStream(fichero);
                ObjectOutputStream dataOS = new ObjectOutputStream(ficheroFile);

                FileInputStream ficheroInFile = new FileInputStream(fichero);
                ObjectInputStream dataIS_artista = new ObjectInputStream(ficheroInFile);

                String nombres[] = {"Ana", "Luis", "Alicia", "Pedro", "Sergio", "Daniel", "Roman", "Mario", "Javier", "Antonio", "Juan", "Alejandro", "Alfredo", "Arturo", "Felipe", "Manuel", "DADDY", "BAD", "Karol", "Ferran"};

                String apellidos[] = {"Gutierrez", "Lopez", "Olmo", "Garcia", "Lopez", "Martin", "Martinez", "Gaspar", "Mansilla", "Lopez", "Franscisco", "Sanz", "Di Stefano", "Grao", "Augusto", "Carrasco", "YANKEE", "BUNNY", "G", "Adria"};

                int numero = 0;
                System.out.println("ARTISTAS");
                System.out.println("-----------------------");
                for (int i = 0; i < apellidos.length; i++) {
                    numero++;
                    artista = new Artista(nombres[i], apellidos[i], numero);
                    dataOS.writeObject(artista);
                }

                try {
                    while (true) {
                        artista = (Artista) dataIS_artista.readObject();
                        System.out.printf("Codigo: %d, Nombre: %s, Apellido: %s %n", numero, artista.getNombre(), artista.getApellido());
                    }
                } catch (EOFException eo) {
                    System.out.println("FIN DE LECTURA");
                }

                dataOS.close();      

                break;
                
                
                
            case 2://LOCALIDAD
    
                File fichero1 = new File("src/documentos/localidades.txt");
                FileOutputStream ficheroLoc = new FileOutputStream(fichero1);
                ObjectOutputStream dataOS_Loc = new ObjectOutputStream(ficheroLoc);

                FileInputStream filein_localidad = new FileInputStream(fichero1);
                ObjectInputStream dataIS_localidad = new ObjectInputStream(filein_localidad);

                String localidad1[] = {"Madrid", "Alcorcon", "Mostoles", "Leganes", "Fuenlabrada", "Navalcarnero", "Boadilla", "Pozuelo", "Villa", "Aluche", "Murcia", "Albacete", "Valladolid", "Soria", "Asturias", "Avila", "Salamanca", "Leon", "Barcelona", "Sevilla"};

                int numero1 = 0;
                System.out.println("LOCALIDADES");
                System.out.println("-----------------------");

                for (int i = 0; i < localidad1.length; i++) {
                    numero1++;
                    localidad = new Localidad(localidad1[i], numero1);
                    dataOS_Loc.writeObject(localidad);
                }
                try {
                    while (true) {
                        localidad = (Localidad) dataIS_localidad.readObject();
                        System.out.printf("Codigo: %d, Nombre: %s %n", localidad.getId(), localidad.getLocalidad());
                    }
                } catch (EOFException eo) {
                    System.out.println("FIN DE LECTURA");
                }
                dataIS_localidad.close();
                break;
                
                
                
            case 3://RECINTO
                
                File fichero2 = new File("src/documentos/recintos.txt");
                FileOutputStream ficheroRe = new FileOutputStream(fichero2);
                ObjectOutputStream dataOS_Re = new ObjectOutputStream(ficheroRe);
                
                FileInputStream filein_recinto = new FileInputStream(fichero2);
                ObjectInputStream dataIS_recinto = new ObjectInputStream(filein_recinto);
                
                String recintos[] = {"Fabrik", "Wanda", "Bernabeu", "Municipal de Leganés", "Mariano Gonzalez Arena", "Camp Nou", "Jose Zorrilla", "Goya", "La Riviera", "El Bakkali", "El Odragau", "San Siro", "Allianza Arena", "Signal Iduna Park", "Etihad Stadium", "Stamford bridge", "El Alamo", "El Yukusima", "El monumental", "La Bombonera"};

                int numero2 = 0;

                System.out.println("RECINTOS");
                System.out.println("-----------------------");

                for (int i = 0; i < recintos.length; i++) {
                    numero2++;
                    recinto = new Recinto(recintos[i], numero2);
                    dataOS_Re.writeObject(recinto);
                }
                try {
                    while (true) {
                        recinto = (Recinto) dataIS_recinto.readObject();
                        System.out.printf("Codigo: %d, Nombre: %s %n", recinto.getId(), recinto.getRecintos());
                    }
                } catch (EOFException eo) {
                    System.out.println("FIN DE LECTURA");
                }
                dataIS_recinto.close();
                
                break;
                
                
                
                
                
            case 4://TIPOEVENTO

                
                File fichero3 = new File("src/documentos/tipoevento.txt");
                FileOutputStream ficheroTipoEv = new FileOutputStream(fichero3);
                ObjectOutputStream dataOS_TipoEv = new ObjectOutputStream(ficheroTipoEv);
                
                FileInputStream filein_TipoEv = new FileInputStream(fichero3);
                ObjectInputStream dataIS_tipoEv = new ObjectInputStream(filein_TipoEv);

                String tipoeventos[] = {"Concierto", "Teatro", "musical", "Concierto", "musical", "Concierto", "Teatro", "Concierto", "musical", "Concierto", "musical", "Concierto", "Teatro", "Concierto", "musical", "Teatro", "musical", "Concierto", "Teatro", "musical"};

                int numero3 = 0;

                System.out.println("TIPOS DE EVENTO");
                System.out.println("-----------------------");

                for (int i = 0; i < tipoeventos.length; i++) {
                    numero3++;
                    tipEvento = new TipoEvento(tipoeventos[i], numero3);
                    dataOS_TipoEv.writeObject(tipEvento);
                }
                try {
                    while (true) {
                        recinto = (Recinto) dataIS_tipoEv.readObject();
                        System.out.printf("Codigo: %d, Nombre: %s %n", recinto.getId(), recinto.getRecintos());
                    }
                } catch (EOFException eo) {
                    System.out.println("FIN DE LECTURA");
                }
                dataIS_tipoEv.close();
     
                break;

            case 5:

                //EVENTOS
                File fichero4 = new File("src/documentos/Evento.txt");
                FileWriter output4 = new FileWriter(fichero4);

                String eventos[] = {"24/12/2013", "14/8/2025", "31/12/2020", "25/3/2019", "3/6/2020", "6/8/2020", "3/7/2020", "8/1/2020", "9/9/2020", "1/1/2020", "8/6/2020", "8/6/2020", "9/9/2020", "3/3/2020", "8/1/2020", "1/1/2020", "4/4/2021", "6/3/2020", "9/10/2020", "28/2/2020"};

                int numero4 = 0;
                System.out.println("EVENTOS");
                System.out.println("-----------------------");

                for (int i = 0; i < eventos.length; i++) {
                    numero4++;
                    System.out.print("ID_Evento: " + numero4 + "   " + "NOMBRE: " + eventos[i] + "\n");
                    output4.write(numero4);
                    output4.write(eventos[i]);

                }

                output4.close();

                try {
                    BufferedReader dataIS4 = new BufferedReader(new FileReader(fichero4));
                    String linea;
                    while ((linea = dataIS4.readLine()) != null) {
                        System.out.println(linea);

                    }
                    dataIS4.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("No se encuentra el fichero");
                } catch (IOException ex) {
                    ex.printStackTrace();
                    System.out.println("Error E/S");
                }

                break;
        }
    }
}
