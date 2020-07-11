import java.util.Scanner;

public class Citas extends Personas{
	
	Scanner ccan = new Scanner(System.in);
	Doctores doctor = new Doctores();
	int b,c,d;
	public static String e ="";
	public Citas(){
	}

	public Citas(String Dnombre,String Pnombre,String Dapellido,String Papellido,String Dcontrasena,String Pcontrasena,String Indoc,String condoc,String Inpas,String conpas){
		super(Dnombre,Dapellido,Dcontrasena,Pnombre,Papellido,Pcontrasena,Indoc,condoc,Inpas,conpas);

	}
		public void AccionCitas(String Dnombre,String Dapellido,String Pnombre, String Papellido){
		
		System.out.println("Bienvendio a la opcion de citas, Con quien necesita solicitar una cita?");
		System.out.println("Estos son los doctores que tenemos disponibles hasta el momento");
		System.out.println();
		System.out.println("1." + Dnombre + "" + Dapellido);
		b = ccan.nextInt();
		
		switch(b){
			case 1:
				System.out.println("Eliga el dia que este disponible el doctor para tomar su cita");
				System.out.println(doctor.getHorario());
				System.out.println(doctor.getHorario2());
				e = ccan.next();
				System.out.println("Gracias por reservar una cita el dia " + e);
				System.out.println("El doctor lo tomara en cuenta");
				
		}
		
		}
	
}