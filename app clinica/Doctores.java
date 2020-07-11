import java.util.Scanner;
import java.util.ArrayList;

public class Doctores extends Personas{


Personas per = new Personas();
Scanner scan = new Scanner(System.in);
String Especialidad;
public static String Horario;
public static String Horario2;
int op,otrousuario,otrod;
public static String z;
public static int a;
public static int y;
public static String disponible = "";
public static String disponible2 = "";


ArrayList<String> listadedoctores = new ArrayList<String>();


//--------------constructor 
public Doctores(){
}

public Doctores(String Dnombre,String Pnombre,String Dapellido,String Papellido,String Dcontrasena,String Pcontrasena,String Indoc,String condoc,String Inpas,String conpas){
		super(Dnombre,Dapellido,Dcontrasena,Pnombre,Papellido,Pcontrasena,Indoc,condoc,Inpas,conpas);
		this.Especialidad = Especialidad;
}

		public void setHorario(String Horario){
			this.Horario = Horario;
}
		public String getHorario(){
			return Horario;
}
		public void setHorario2(String Horario2){
			this.Horario2 = Horario2;
}
		public String getHorario2(){
			return Horario2;
}

public void AccionD(String Dnombre,String Dapellido, String Dcontrasena,String especialidad){
	//crear usuario para doctores
			
		y = 0;
		do{
		System.out.println("****************************---------------------****************************");
		System.out.println("Crear un usuario");
		System.out.println("Iniciar sesion");
		System.out.println("");
		z = scan.nextLine();
		
		if(z.equals("Crear usuario")||z.equals("crear usuario")){
		y = 0;
		System.out.println("Cree un usuario");
		System.out.println("****************************---------------------****************************");
		System.out.println("Ingrese su nombre");
		Dnombre = scan.nextLine();
		this.setDnombre(Dnombre);
		System.out.println("Ingrese su apellido");
		Dapellido = scan.nextLine();
		this.setDapellido(Dapellido);
		System.out.println("Ingrese su contrasena");
		Dcontrasena = scan.nextLine();
		this.setDcontrasena(Dcontrasena);
		
		listadedoctores.add(Dnombre);
		listadedoctores.add(Dapellido);
		listadedoctores.add(Dcontrasena);
		listadedoctores.add(especialidad);
		
		
		op=0;	

	
	//------------------Ingresar a la cuenta creada			
		}else if(z.equals("Iniciar sesion")||z.equals("iniciar sesion")){//------------------Inicio de secion	
		y = 0;
		System.out.println("****************************---------------------****************************");
		System.out.println("Hola, bienvenido a nuestra app para doctores.");
		do{
		System.out.println("Identifiquese por favor");
		System.out.println("Ingrese su nombre");
		Indoc = scan.nextLine();
		
		System.out.println("Ingrese su contrasena");
		condoc = scan.nextLine();
		}while(Indoc.equals(listadedoctores.get(0)) != condoc.equals(listadedoctores.get(2)));
									
			if(Indoc.equals(listadedoctores.get(0)) && condoc.equals(listadedoctores.get(2))){
						System.out.println("****************************---------------------****************************");
			System.out.println("Hola "+ Dnombre +" has iniciado sesion exitosamente");
			System.out.println("Te damos la bienvenida a nuestra applicacion para doctores");
						System.out.println("****************************---------------------****************************");
			System.out.println("¿Que acción decea realizar?");
						System.out.println("****************************---------------------****************************");
			System.out.println("");
			do{
			System.out.println("1.Ver listado de pacientes");
			System.out.println("2.Asignar horarios en los que estara disponible");
			System.out.println("3.Ver el listado de citas");
			System.out.println("4.cerrar sesion");
			
			
			op = scan.nextInt();
			
			switch (op){
				case 1:
						//Ver listado de pacientes Asignados
						//System.out.println(this.getPnombre());
						if(Pnombre == null){
							System.out.println("****************************---------------------****************************");
							System.out.println("No hay pacientes por el momento");
							System.out.println("");
							System.out.println("****************************---------------------****************************");
							System.out.println("Desea regresar al menu principal");
							System.out.println("1.Si");
							System.out.println("2.No");
							
									a = scan.nextInt();
									if(a != 1){
										System.out.println("Gracias por usar nuesta app");
										System.exit(0);
									}
									if(a == 1){
										
										disponible = "salir";
										break;
									}
						}else {
							System.out.println(this.getPnombre());
							System.out.println("");
							a = 1;
						}
						
						break;
				case 2:
				
						//Asignar dias de la semana disponibles
						System.out.println("Por favor Asigne sus horarios");
						do{
						System.out.println("Estara disponible el dia");
						System.out.println("");
						System.out.println("Lunes");
						System.out.println("Martes");
						System.out.println("Miercoles");
						System.out.println("Jueves");
						System.out.println("Viernes");
						System.out.println("Sabado");
						System.out.println("domingo");
						disponible = scan.next();
						this.setHorario(disponible);
						//Condicion para dejar continuar con el codigo
						if(disponible.equals("Lunes")||disponible.equals("Martes")||disponible.equals("Miercoles")||disponible.equals("Jueves")||disponible.equals("Viernes")||disponible.equals("Sabado")||disponible.equals("Domingo")){
							System.out.println("Necesita asignar otro dia?");
							System.out.println("1.si");
							System.out.println("2.no");
							otrod = scan.nextInt();
						if(otrod > 2){
							System.out.println("Opcion no valida 1");
						}else {
							switch(otrod){
								case 1: 
								//Opcion para asignar otro dia
									System.out.println("Ingrese el dia");
									disponible2 = scan.next();
									this.setHorario2(disponible2);
									System.out.println("Desea regresar al menu principal");
									System.out.println("1.Si");
									System.out.println("2.No");
									
									a = scan.nextInt();
									if(a != 1){
										System.out.println("Gracias por usar nuesta app");
										System.exit(0);
									}
									if(a == 1){
										
										disponible = "salir";
										break;
									}
									
								case 2:
									
									System.out.println("Desea regresar al menu principal");
									System.out.println("1.Si");
									System.out.println("2.No");
									
									a = scan.nextInt();
									if(a != 1){
										System.out.println("Gracias por usar nuestra app.");
										System.exit(0);
									}if(a == 1){
										disponible = "salir";
									
									}
									                                                 
									break;
							}
							}
							
						}else{
							System.out.println("opcion no valida ");
						}	
						
						}while( !disponible.equals("salir"));
				break;
						
						
						
					
				case 3:
					//Ver el listado de citas programadas
					Citas cita = new Citas();
					if(cita.e.equals("")){
						System.out.println("****************************---------------------****************************");
						System.out.println("En hora buena! No hay citas programadas ");
						System.out.println("****************************---------------------****************************");
						System.out.println("");
						a = 1;
					}else{
					System.out.println("La cita que esta programada es para el dia " + cita.e + " y la programo el paciente: "+ Pnombre );
					System.out.println("Desea regresar al menu principal");
					System.out.println("1.Si");
					System.out.println("2.No");
						a = scan.nextInt();
							if(a != 1){
								System.out.println("Gracias por usar nuesta app");
								System.exit(0);
								}
								if(a == 1){
										
								disponible = "salir";
								}
					}
					break;
				case 4:
					//salir
					
						System.out.println("Desea regresar al menu principal");
						System.out.println("1.Si");
						System.out.println("2.No");
						y = scan.nextInt();
					
						
						if(y != 1){
							System.out.println("Gracias por usar nuestra app.");
							System.exit(0);
							a = 2;
						}if(y == 1){
							disponible = "salir";
							a = 2;
						}
						
				break;		
				
			}
			}while(a == 1);
			}else{System.out.println("Opcion no valida");}
			}
			}while( !disponible.equals("salir"));
			}
			}
		