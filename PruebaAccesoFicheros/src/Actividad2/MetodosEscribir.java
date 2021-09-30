package Actividad2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MetodosEscribir {
	
	
	
	public MetodosEscribir() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void crearFichero() {
		
		try {
			String ruta = "./Recursos/info-fichero.txt";
			File fichero = new File (ruta);
			if(!fichero.exists()) {
				fichero.createNewFile();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void EscribirDatos(){
		
		try {
			String ruta = "./Recursos/info-fichero.txt";
			String inicio = "Nombre, Apellido, Curso";
			FileReader fichero = new FileReader(ruta);
			BufferedReader br = new BufferedReader(fichero);
			BufferedWriter writer = new BufferedWriter(new FileWriter(ruta,true));
				
				if(br.readLine() == null) {
					writer.write(inicio);
				}
		
			Scanner teclado = new Scanner(System.in);
			writer.newLine();
			writer.write(teclado.nextLine());
			writer.close();
			teclado.close();
			br.close();
			
		} catch(IOException e) {
			
		}
	}

}
