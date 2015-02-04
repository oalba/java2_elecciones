class Plaza extends EspacioPublico {
	private String nombre;
	private int numBares;

	private Plaza(int extension, String direccion, String nombre, int numBares) {
		super(extension, direccion);
		this.nombre = nombre;
		this.numBares = numBares;
	}

	private void setNombre(String nom){
		nombre = nom;
	}
	private final String getNombre(){
		return nombre;
	}
	private void setNumBares(int nbar){
		numBares = nbar;
	}
	private final int getNumBares(){
		return numBares;
	}
}