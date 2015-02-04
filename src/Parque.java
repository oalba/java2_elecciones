class Parque extends EspacioPublico {
	private String nombre;
	private String tipo;//juego o botanico

	private Parque(int extension, String direccion, String nombre, String tipo) {
		super(extension, direccion);
		this.nombre = nombre;
		this.tipo = tipo;
	}

	private void setNombre(String nom){
		nombre = nom;
	}
	private final String getNombre(){
		return nombre;
	}
	private void setTipo(String tip){
		tipo = tip;
	}
	private final String getTipo(){
		return tipo;
	}
}