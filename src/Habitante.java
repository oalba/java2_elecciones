class Habitante {
	private String dni;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int edad;
	private String sexo;

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
}
