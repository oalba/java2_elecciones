class EspacioPublico {
	int extension;
	String direccion;

	private EspacioPublico(int extension, String direccion){
		this.extension = extension;
		this.direccion = direccion;
	}

	/*public EspacioPublico(int extension, String direccion) {
		this.Extension = extension;
		this.Direccion = direccion;
	}*/

	EspacioPublico() {
		// TODO Auto-generated constructor stub
	}

	void setExtension (int ex){
		extension = ex;
	}
	final int getExtension(){
		return extension;
	}

	void setDireccion (String dir){
		direccion = dir;
	}
	final String getDireccion(){
		return direccion;
	}
}