public class Plaza extends EspacioPublico {
	public String nombre;
	public int numBares;

	public Plaza(int extension, String direccion, String nombre, int numBares) {
		super(extension, direccion);
		this.nombre = nombre;
		this.numBares = numBares;
	}

	public void setNombre(String nom){
		nombre = nom;
	}
	public String getNombre(){
		return nombre;
	}
	public void setNumBares(int nbar){
		numBares = nbar;
	}
	public int getNumBares(){
		return numBares;
	}
}