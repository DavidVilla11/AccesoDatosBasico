package Actividad1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AccesoDatos {
	
	protected String data;
	
	
	public AccesoDatos() {
		super();
		
	}
	
	public String LecturaDatos(String data) throws IOException {
		String Json = null;
		BufferedReader objReader = null;
		try {
			
			objReader = new BufferedReader(new FileReader(data));

			while ((Json = objReader.readLine()) != null) {
				System.out.println(Json);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (objReader != null)
				objReader.close();
		}
		
		return Json;
	}
	
	
	
}
