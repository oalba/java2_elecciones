class Parking extends EspacioPublico {
	private int plazas;
	
	/*public Parking(){
		super();
	}*/
	private Parking(int extension, String direccion, int plazas) {
		super(extension, direccion);
		this.plazas = plazas;
	}

	private void setPlazas(int plaz){
		plazas = plaz;
	}
	private final int getPlazas(){
		return plazas;
	}
}