import java.util.*;
import java.io.*;
class Habitante {
	String dni;
	String nombre;
	String apellido1;
	String apellido2;
	int edad;
	String sexo;

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

	/*static void imprimirHabi(){
		System.out.println("\n---Habitante---");
		System.out.println("DNI: " + dni);
		System.out.println("Nombre: " + nombre);
		System.out.println("Primer apellido: " + apellido1);
		System.out.println("Segundo apellido: " + apellido2);
		System.out.println("Sexo: " + sexo);
		System.out.println("Edad: " + edad);
	}*/

	static void imprimirHabi2(){
		System.out.println("\n---Habitantes mayores de 18 años---");
		ArrayList<Habitante> habitantes = new ArrayList<Habitante>();
		File archihabit = new File("./censo.txt");
		Scanner sca = null;

		try {
			sca = new Scanner(archihabit);
			
			while (sca.hasNextLine()) {
				String habi = sca.nextLine();
				String[] dato = habi.split(", ");
				Habitante habitdat = new Habitante();

				habitdat.setDni(dato[0]);
				habitdat.setNombre(dato[1]);
				habitdat.setApellido1(dato[2]);
				habitdat.setApellido2(dato[3]);
				habitdat.setSexo(dato[5]);
				int edadhabit = Integer.parseInt(dato[4]);
				habitdat.setEdad(edadhabit);

				habitantes.add(habitdat);
				
			}
			Iterator<Habitante> itrHabitantes = habitantes.iterator();
			while(itrHabitantes.hasNext()){
				Habitante habitdat = itrHabitantes.next();
				if (habitdat.getEdad() >= 18) {
				System.out.println("DNI del habitante: " + habitdat.getDni());
				System.out.println("Nombre del habitante: " + habitdat.getNombre());
				System.out.println("Primer apellido del habitante: " + habitdat.getApellido1());
				System.out.println("Segundo apellido del habitante: " + habitdat.getApellido2());
				System.out.println("Edad del habitante: " + habitdat.getEdad());
				System.out.println("Sexo del habitante: " + habitdat.getSexo());
				System.out.println();
				}
			}

		} catch (IOException ioe) {
			System.out.println("Error E/S: " + ioe);
		}
	}
}
