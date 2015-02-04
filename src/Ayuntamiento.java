class Ayuntamiento {
	private String poblacion;
	private String localidad;
	private String alcalde;

	void setPoblacion (String pob){
		poblacion = pob;
	}
	final String getPoblacion(){
		return poblacion;
	}

	void setLocalidad (String local){
		localidad = local;
	}
	final String getLocalidad(){
		return localidad;
	}

	void setAlcalde (String alc){
		alcalde = alc;
	}
	final String getAlcalde(){
		return alcalde;
	}	
}