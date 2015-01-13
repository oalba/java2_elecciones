public class Parque extends EspacioPublico {
	public String nombre;
	public String tipo;//juego o botanico

	public Parque(int extension, String direccion, String nombre, String tipo) {
		super(extension, direccion);
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public void setNombre(String nom){
		nombre = nom;
	}
	public String getNombre(){
		return nombre;
	}
	public void setTipo(String tip){
		tipo = tip;
	}
	public String getTipo(){
		return tipo;
	}
}