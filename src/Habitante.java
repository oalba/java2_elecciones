class Habitante {
	private static String dni;
	private static String nombre;
	private static String apellido1;
	private static String apellido2;
	private static int edad;
	private static String sexo;

	void setDni (String ni){
		dni = ni;
	}
	final String getDni(){
		return dni;
	}

	void setNombre (String nom){
		nombre = nom;
	}
	final String getNombre(){
		return nombre;
	}

	void setApellido1 (String ap1){
		apellido1 = ap1;
	}
	final String getApellido1(){
		return apellido1;
	}

	void setApellido2 (String ap2){
		apellido2 = ap2;
	}
	final String getApellido2(){
		return apellido2;
	}

	void setEdad (int ed){
		edad = ed;
	}
	final int getEdad(){
		return edad;
	}

	void setSexo (String sex){
		sexo = sex;
	}
	final String getSexo(){
		return sexo;
	}

	public static void imprimirHabi(){
		System.out.println("\n---Habitante---");
		System.out.println("DNI: " + dni);
		System.out.println("Nombre: " + nombre);
		System.out.println("Primer apellido: " + apellido1);
		System.out.println("Segundo apellido: " + apellido2);
		System.out.println("Sexo: " + sexo);
		System.out.println("Edad: " + edad);
	}
}
