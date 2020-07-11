
public class Personas{


protected static String Dnombre;
protected static String Pnombre;
protected static String Dapellido;
protected static String Papellido = "";
protected static String Dcontrasena = "";
protected static String Pcontrasena = "";
protected static String Indoc = "";
protected static String condoc = "";
protected static String Inpas = "";
protected static String conpas = "";

protected static String usuarios = "";

int op,otrousuario;

public Personas(){
	
}

public Personas(String Dnombre,String Pnombre,String Dapellido,String Papellido,String Dcontrasena,String Pcontrasena,String Indoc,String condoc,String Inpas,String conpas){
		this.Dnombre = Dnombre;
		this.Pnombre = Pnombre;
		this.Dapellido = Dapellido;
		this.Papellido = Papellido;
		this.Dcontrasena = Dcontrasena;
		this.Pcontrasena = Pcontrasena;
		this.Indoc = Indoc;
		this.condoc = condoc;
		this.conpas = conpas;
		this.Inpas = Inpas;
		
}
		public void setPnombre(String Pnombre){
			this.Pnombre = Pnombre;
}
		public void setDnombre(String Dnombre){
			this.Dnombre = Dnombre;
}
		public void setPapellido(String Papellido){
			this.Papellido = Papellido;
}
		public void setDapellido(String Dapellido){
			this.Dapellido = Dapellido;
}
		public void setPcontrasena(String Pcontrasena){
			this.Pcontrasena = Pcontrasena;
}
		public void setDcontrasena(String Dcontrasena){
			this.Dcontrasena = Dcontrasena;
}
		public void setIndoc(String Indoc){
			this.Indoc = Indoc;
}
		public void setInpas(String Inpas){
			this.Inpas = Inpas;
}
		public void setconpas(String conpas){
			this.conpas = conpas;
}
		public void setcondoc(String condoc){
			this.condoc = condoc;
}
		public void setusuarios(String usuarios){
			this.usuarios = usuarios;
}
		public String getusuarios(){
			return usuarios;
}
		public String getIndoc(){
			return Indoc;
}
		public String getcondoc(){
			return condoc;
}
		public String getInpas(){
			return Inpas;
}
		public String getconpas(){
			return conpas;
}
		public String getPnombre(){
			return Pnombre;
}
		public String getDnombre(){
			return Dnombre;
}
		public String getPapellido(){
			return Papellido;
}
		public String getDapellido(){
			return Dapellido;
}
		public String getDcontrasena(){
			return Dcontrasena;
}
		public String getPcontrasena(){
			return Pcontrasena;
}
}