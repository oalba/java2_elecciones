class Partido {
	private String nombre;
	private String siglas;
	private String presidente;
	private String numeroAfiliados;

	void setNombre (String nom){
		nombre = nom;
	}
	String getNombre(){
		return nombre;
	}

	void setSiglas (String sig){
		siglas = sig;
	}
	String getSiglas(){
		return siglas;
	}

	void setPresidente (String pre){
		presidente = pre;
	}
	String getPresidente(){
		return presidente;
	}

	void setNumeroAfiliados (String na){
		numeroAfiliados = na;
	}
	String getNumeroAfiliados(){
		return numeroAfiliados;
	}
}
