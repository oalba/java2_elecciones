public class Parking extends EspacioPublico {
	public int plazas;
	
	/*public Parking(){
		super();
	}*/
	public Parking(int extension, String direccion, int plazas) {
		super(extension, direccion);
		this.plazas = plazas;
	}

	public void setPlazas(int plaz){
		plazas = plaz;
	}
	public int getPlazas(){
		return plazas;
	}
}