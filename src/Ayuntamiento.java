class Ayuntamiento {
	private static String poblacion;
	private static String localidad;
	private static String alcalde;

	static void setPoblacion (String pob){
		poblacion = pob;
	}
	final String getPoblacion(){
		return poblacion;
	}

	static void setLocalidad (String local){
		localidad = local;
	}
	final String getLocalidad(){
		return localidad;
	}

	static void setAlcalde (String alc){
		alcalde = alc;
	}
	final String getAlcalde(){
		return alcalde;
	}

	static void imprimirAyu(){
		System.out.println("\n---Ayuntamiento---");
		System.out.println("Poblacion: " + poblacion);
		System.out.println("Localidad: " + localidad);
		System.out.println("Alcalde: " + alcalde);
	}
}