import java.util.Scanner;
import java.util.ArrayList;
        
public class Principal{
	public static void main (String [] args){
	
	Scanner scan = new Scanner(System.in);
	Doctores doctores = new Doctores();
	
	int identificad;
	
	String Pnombre = "";
	String Dnombre = "";
	String Papellido = "";
	String Dapellido = "";
	String Pcontrasena = "";
	String Dcontrasena = "";
	String especialidad = "";
	do{
	System.out.println("Hola, bienvenido a nuestra app para hospitales.");
	do{
	System.out.println("Identifiquese por favor");
	System.out.println("1.Doctor");
	System.out.println("2.Paciente");
		identificad = scan.nextInt();
	System.out.println("");
	}while(identificad >= 3 || identificad <=0);
	
	switch(identificad){
					case 1: 
						Doctores doc = new Doctores();
						doc.AccionD(Dnombre,Dapellido,Dcontrasena,especialidad);
						
						break;
						
					case 2:
						Pacientes pasien = new Pacientes();
						pasien.AccionP(Pnombre,Papellido,Pcontrasena);
						break;
	}
	}while(doctores.y == 1||Pacientes.x == 1);
	}
	
}

//menu para pacientes,      menu para docs
//crear usuarios y luego ingresar