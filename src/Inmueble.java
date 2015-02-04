class Inmueble {
	private String direccion;
	private int codigopostal;
	private int pisos;

	void setDireccion (String dir){
		direccion = dir;
	}
	final String getDireccion(){
		return direccion;
	}

	void setCodigoPostal (int cp){
		codigopostal = cp;
	}
	final int getCodigoPostal(){
		return codigopostal;
	}

	void setPisos (int piso){
		pisos = piso;
	}
	final int getPisos(){
		return pisos;
	}
}
