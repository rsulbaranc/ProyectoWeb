package Proyecto.Controllers;

import Proyecto.Helpers.*;


public class RegisterController {
	
	public static String  RegistrarDB(String UNameCon, String PassCon,
			String EmailCon, String AgeCon , String CounCon, String GenCon) {
		
		String PassHash = Hash.Encriptar(PassCon);
		System.out.println(GenCon);
		String query = ("insert into users values ('" +UNameCon 
				+ "', '" +PassHash+ "', '"  +EmailCon+ "', " + AgeCon 
				+ ", '" +CounCon+ "', '" +GenCon+ "')");
		
		int respuestaRegistro = ConnectionDB.RegistrarSql(query);
		if (respuestaRegistro == 1) {
			System.out.println("Registro Exitoso");
			return "Felicidades! tu registro se ha realizado exitosamente";
		}
		else
			System.out.println("error en el registro");
			return "Ocurrio un error al momento Registrarte, intentalo nuevamente";
	}

}
