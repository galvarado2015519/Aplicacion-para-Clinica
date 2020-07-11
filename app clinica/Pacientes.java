//pacientes
import java.util.Scanner;
import java.util.ArrayList;

public class Pacientes extends Personas{


Scanner pcan = new Scanner(System.in);
Citas cit = new Citas();
Doctores Docs = new Doctores();
Clinica clic = new Clinica();

int opp;
String l,m,n,k,e,disponible;
public static int b;
public static int x;
public static String ddisponible = "";


ArrayList<String> listadepacientes = new ArrayList<String>();



public Pacientes(){
}

public Pacientes(String Dnombre,String Pnombre,String Dapellido,String Papellido,String Dcontrasena,String Pcontrasena,String Indoc,String condoc,String Inpas,String conpas){
		super(Dnombre,Dapellido,Dcontrasena,Pnombre,Papellido,Pcontrasena,Indoc,condoc,Inpas,conpas);
		
}
	public void AccionP(String Pnombre, String Papellido,String Pcontrasena){
		
		//----------------------------------------crear usuario
		//try {
			x = 0;
		do{
		System.out.println("****************************---------------------****************************");
		System.out.println("Crear usuario");
		System.out.println("Iniciar sesion");
		System.out.println("");
		k = pcan.nextLine();
		

		if(k.equals("Crear usuario")||k.equals("crear usuario")){
		System.out.println("****************************---------------------****************************");
		System.out.println("Ingrese su nombre");
		Pnombre = pcan.nextLine();
		this.setPnombre(Pnombre);
		System.out.println("Ingrese su apellido");
		Papellido = pcan.nextLine();
		this.setPapellido(Papellido);
		System.out.println("Ingrese su contrasena");
		Pcontrasena = pcan.nextLine();
		this.setPcontrasena(Pcontrasena);
		
		listadepacientes.add(Pnombre);
		listadepacientes.add(Papellido);
		listadepacientes.add(Pcontrasena);
		
		//-------------------------------------------iniciar sesion
		}else if(k.equals("Iniciar sesion")||k.equals("iniciar sesion")){//------------------Inicio de secion
		System.out.println("****************************---------------------****************************");
		System.out.println("Hola, bienvenido a nuestra app para Paceintes.");
		do{
		System.out.println("Identifiquese por favor");
		System.out.println("Ingrese su nombre");
		Inpas = pcan.next();
		
		System.out.println("Ingrese su contrasena");
		conpas = pcan.next();
	
		}while(Inpas.equals(listadepacientes.get(0)) != conpas.equals(listadepacientes.get(2)));
		if(Inpas.equals(listadepacientes.get(0)) && conpas.equals(listadepacientes.get(2))){
			System.out.println("****************************---------------------****************************");
			System.out.println("Hola "+ Pnombre +" has iniciado sesion exitosamente");
			System.out.println("Te damos la bienvenida a nuestra applicacion para pacientes");
			System.out.println("****************************---------------------****************************");
			System.out.println("-------------------------¿Que acción decea realizar?--------------------------");
			System.out.println("****************************---------------------****************************");
			System.out.println("");
			do{
			System.out.println("1.Ver listado de Doctores");
			System.out.println("2.Asignar cita");
			System.out.println("3.Asignar clinica");
			System.out.println("4.Cerrar sesion");
			
			opp = pcan.nextInt();
			
			switch (opp){
				
				case 1: 
						System.out.println(this.getDnombre());
						if(this.getDnombre() == null){
							System.out.println("****************************---------------------****************************");
							System.out.println("No hay doctores disponibles hasta el momento.");
							System.out.println("****************************---------------------****************************");

							b = 1;
							
						}else{
							System.out.println("****************************---------------------****************************");
							System.out.println("Los doctores disponibles son: ");
							System.out.println(this.getDnombre());
							b = 1;
							System.out.println("****************************---------------------****************************");
						}
						break;
				case 2:
						System.out.println("****************************---------------------****************************");
						if(this.getDnombre() == null){
							System.out.println("****************************---------------------****************************");
							System.out.println("No hay doctores disponibles hasta el momento para hacer reservar una cita.");
							b = 1;
						}else{
						cit.AccionCitas(Dnombre,Dapellido,Pnombre,Papellido);
					
						System.out.println("Desea regresar al menu principal");
						System.out.println("1.Si");
						System.out.println("2.No");
									
						b = pcan.nextInt();
						if(b != 1){
							System.out.println("Gracias por usar nuestra app.");
							System.exit(0);
						}if(b == 1){
							ddisponible = "salir";
									
						}		
						}
						
						
						break;
				case 3:
				
						System.out.println("****************************---------------------****************************");
						System.out.println("Eliga su clinica: ");
						clic.ClinicaA();
						clic.ClinicaB();
						clic.ClinicaC();
						m = pcan.nextLine();
						m = pcan.nextLine();
						clic.setClinicaS(m);
						System.out.println("Gracias por asignarse a la clinica " + m);
						
						System.out.println("****************************---------------------****************************");						
						System.out.println("Desea regresar al menu principal");
						System.out.println("1.Si");
						System.out.println("2.No");
									
						b = pcan.nextInt();
							if(b != 1){
								System.out.println("Gracias por usar nuestra app.");
								System.exit(0);
							}if(b == 1){
								ddisponible = "salir";
								
							}
						
						break;
				
				case 4:
						do{
						System.out.println("Desea regresar al menu principal");
						System.out.println("1.Si");
						System.out.println("2.No");
									
						x = pcan.nextInt();
						if(x != 1){
							System.out.println("Gracias por usar nuestra app.");
							System.exit(0);
						}if(x == 1){
							ddisponible = "salir";
							b = 2;		
						}
						}while(x != 1);
						break;
					
			}
			}while(b == 1);
			}
			}			
			}while( !ddisponible.equals("salir"));
			//}catch(Exception ex){
			//	System.out.println("opcion no aceptada");
			//}
			}
			}