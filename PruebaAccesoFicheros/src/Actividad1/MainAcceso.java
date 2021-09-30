package Actividad1;

//SI DA ERROR ESTE PROYECTO MIRAD EN PROPIERTIES -> JAVA BUILD PATH Y EN LIBRERIAS VER QUE ESTA BIEN LA UBICACION
//DEL JSON.JAR Y GSON.JAR

public class MainAcceso {

	public static void main(String[] args) throws Throwable {

		AccesoDatos prueba = new AccesoDatos();
		
		prueba.LecturaDatos("C:/xampp/htdocs/aadd/recursos/infoinstitutodam2.json");
	}
}
