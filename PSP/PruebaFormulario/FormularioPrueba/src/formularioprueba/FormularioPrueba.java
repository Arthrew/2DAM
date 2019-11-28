/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularioprueba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Usuario DAM 2
 */
public class FormularioPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

			URL url = new URL("http://jesusninoc.com/fbru123/GetPost/getindex.php");
			URLConnection conexion = url.openConnection();
			conexion.setDoOutput(true);
			String cadena = "nombre=Javier&edad=Rojasssssss";
			// ESCRIBIR EN LA URL
			PrintWriter output = new PrintWriter(conexion.getOutputStream());
			output.write(cadena);
			output.close(); // cerrar flujo
			// LEER DE LA URL
			BufferedReader reader = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
			String linea;
			while ((linea = reader.readLine()) != null) {
				System.out.println(linea);
			}
			reader.close();// cerrar flujo
		} catch (MalformedURLException me) {
			System.err.println("MalformedURLException: " + me);
		} catch (IOException ioe) {
			System.err.println("IOException:  " + ioe);
		}
    }
    
}
