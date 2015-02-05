class EspacioPublico {
	static int extension;
	static String direccion;

	private EspacioPublico(int extension, String direccion){
		this.extension = extension;
		this.direccion = direccion;
	}

	/*public EspacioPublico(int extension, String direccion) {
		this.Extension = extension;
		this.Direccion = direccion;
	}*/

	static void setExtension (int ex){
		extension = ex;
	}
	final int getExtension(){
		return extension;
	}

	static void setDireccion (String dir){
		direccion = dir;
	}
	final String getDireccion(){
		return direccion;
	}

	static void imprimirEsPu(){
		System.out.println("\n---Espacio publico---");
		System.out.println("Direccion: " + direccion);
		System.out.println("Extension: " + extension + " metros cuadrados");
	}
}