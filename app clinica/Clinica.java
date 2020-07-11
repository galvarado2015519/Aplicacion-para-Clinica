import java.util.Scanner;

public class Clinica{
	
	Scanner clin = new Scanner(System.in);
	protected static String ClinicaA = "";
	protected static String ClinicaB = "";
	protected static String ClinicaC = "";
	protected static String ClinicaS = "";
	
	public void setClinicaA(String ClinicaA){
			this.ClinicaA = ClinicaA;
}
	public void setClinicaB(String ClinicaB){
			this.ClinicaB = ClinicaB;
}
	public void setClinicaC(String ClinicaC){
			this.ClinicaC = ClinicaC;
}	
	public void setClinicaS(String ClinicaS){
			this.ClinicaS = ClinicaS;
}	
		public String getClinicaA(){
			return ClinicaA;
}
		public String getClinicaB(){
			return ClinicaB;
}
		public String getClinicaC(){
			return ClinicaC;
}
		public String getClinicaS(){
			return ClinicaS;
}
	
	public void ClinicaA(){
		System.out.println("Clinica Mosqueira");
		this.setClinicaA("Clinica Mosqueira");
	}
	public void ClinicaB(){
		System.out.println("Clinica Quiron");
		this.setClinicaB("Clinica Quiron");
	}
	public void ClinicaC(){
		System.out.println("Clinica Andalucia");
		this.setClinicaC("Clinica Andalucia");
	}
}