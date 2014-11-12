public class Partido {
	private String nombre;
	private String siglas;
	private String presidente;
	private String numeroAfiliados;

	public void setNombre (String nom){
		nombre = nom;
	}
	public String getNombre(){
		return nombre;
	}

	public void setSiglas (String sig){
		siglas = sig;
	}
	public String getSiglas(){
		return siglas;
	}

	public void setPresidente (String pre){
		presidente = pre;
	}
	public String getPresidente(){
		return presidente;
	}

	public void setNumeroAfiliados (String na){
		numeroAfiliados = na;
	}
	public String getNumeroAfiliados(){
		return numeroAfiliados;
	}
}
