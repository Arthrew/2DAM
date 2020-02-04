/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bajararchivo;

import java.io.*;
import static javax.print.attribute.standard.ReferenceUriSchemesSupported.FTP;

/**
 *
 * @author Usuario DAM 2
 */
public class BajarArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FTPClient cliente = new FTPClient(); //cliente 
        String servidor = "192.168.35.55"; //servidor 
        String user = "parralides";
        String pasw = "barco";

        try {
            System.out.println("Conectandose a " + servidor);
            cliente.connect(servidor);
            boolean login = cliente.login(user, pasw);
            String direc = "servidor";

            if (login) {
                cliente.changeWorkingDirectory(direc);
                cliente.setFileType(FTP.BINARY_FILE_TYPE);

                //Stream de entrada con el fichero a descargar 
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("c:\\petra\\gunto2.png"));

                if (cliente.retrieveFile("gunto2.png", out)) {
                    System.out.println("Recuperado correctamente...");
                } else {
                    System.out.println("No se ha podido descargar...");
                }

                out.close(); //cerrar flujo 
                cliente.logout(); //logout del usuario 
                cliente.disconnect(); // desconexion del servidor 
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
}
