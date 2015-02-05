class Inmueble {
	private static String direccion;
	private static int codigoPostal;
	private static int pisos;

	static void setDireccion (String dir){
		direccion = dir;
	}
	final String getDireccion(){
		return direccion;
	}

	static void setCodigoPostal (int cp){
		codigoPostal = cp;
	}
	final int getCodigoPostal(){
		return codigoPostal;
	}

	static void setPisos (int piso){
		pisos = piso;
	}
	final int getPisos(){
		return pisos;
	}

	static void imprimirInmu(){
		System.out.println("\n---Inmueble---");
		System.out.println("Direccion: " + direccion);
		System.out.println("Codigo postal: " + codigoPostal);
		System.out.println("Numero de pisos: " + pisos);
	}
}
