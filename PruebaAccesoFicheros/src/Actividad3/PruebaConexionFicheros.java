package Actividad3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


public class PruebaConexionFicheros {

	public static void main(String[] args) {
			
			FileReader fichero;
			BufferedReader bf;
			String[] datos = null; 
			try {
				fichero = new FileReader("C:/xampp/htdocs/aadd/recursos/alumnos-dam2-nuevos.txt", StandardCharsets.UTF_8);
				bf = new BufferedReader(fichero);
				String Linea = bf.readLine();
			
				while((Linea)!= null) {
					
					Linea = bf.readLine();
					if(Linea != null) {
					datos = Linea.split(",");
						if(datos.length > 3) {
							String Cadena = datos[1] + ", " + datos[2] + datos[3] + ", DAM2";
							FileWriter FicheroEntrada = new FileWriter("./Recursos/info-fichero.txt", true);
							BufferedWriter bfW = new BufferedWriter(FicheroEntrada);
							bfW.newLine();
							bfW.write(Cadena);
							bfW.close();
							
						} else if (datos.length <= 3) {
							String Cadena = datos[1] + ", " + datos[2] + ", DAM2";
							FileWriter FicheroEntrada = new FileWriter("./Recursos/info-fichero.txt", true);
							BufferedWriter bfW = new BufferedWriter(FicheroEntrada);
							bfW.newLine();
							bfW.write(Cadena);
							bfW.close();
						}
					
					}
				}
				System.out.println("Se han introducido los datos");
				bf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			

	}

}
