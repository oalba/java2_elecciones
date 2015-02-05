import java.util.*;
import java.io.*;

class Elecciones {

	public static void main(String args[]) {

		String dni, nombre, apellido1, apellido2, sexo, poblacion, localidad, alcalde, direccioni, direccionep;
		int edad, codigopostal, pisos, extension;

		//---------------------------------------------------
		Habitante habitante = new Habitante();
		//Ayuntamiento ayuntamiento = new Ayuntamiento();
		//Inmueble inmueble = new Inmueble();
		//EspacioPublico espu = new EspacioPublico();
	
		Scanner sc = new Scanner(System.in);
		System.out.print("\nIntroduce los siguientes datos del habitante: \n");
		System.out.print("DNI: ");
		habitante.setDni(sc.next());
		System.out.print("Nombre: ");
		habitante.setNombre(sc.next());
		System.out.print("Primer apellido: ");
		habitante.setApellido1(sc.next());
		System.out.print("Segundo apellido: ");
		habitante.setApellido2(sc.next());
		System.out.print("Sexo (Hombre o Mujer): ");
		habitante.setSexo(sc.next());
		System.out.print("Edad: ");
		habitante.setEdad(sc.nextInt());

		try{
            
            FileWriter fw = new FileWriter("./censo.txt", true);
            fw.write(habitante.dni + ", " 
            	+ habitante.nombre + ", " 
            	+ habitante.apellido1 + ", " 
            	+ habitante.apellido2 + ", " 
            	+ habitante.edad + ", " 
            	+ habitante.sexo + "\n");
            fw.close(); 
            FileReader fr = new FileReader("./censo.txt");
            fr.close();
            
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }

		System.out.print("\nIntroduce los siguientes datos del ayuntamiento: \n");
		System.out.print("Poblacion: ");
		Ayuntamiento.setPoblacion(sc.next());
		System.out.print("Localidad: ");
		Ayuntamiento.setLocalidad(sc.next());
		System.out.print("Nombre del alcalde: ");
		Ayuntamiento.setAlcalde(sc.next());

		System.out.print("\nIntroduce los siguientes datos del inmueble: \n");
		System.out.print("Direccion: ");
		Inmueble.setDireccion(sc.next());
		System.out.print("Codigo postal: ");
		Inmueble.setCodigoPostal(sc.nextInt());
		System.out.print("Numero de pisos: ");
		Inmueble.setPisos(sc.nextInt());

		System.out.print("\nIntroduce los siguientes datos de un espacio publico: \n");
		System.out.print("Extension (metros cuadrados): ");
		extension = sc.nextInt();
		EspacioPublico.setExtension(extension);
		System.out.print("Direccion: ");
		direccionep = sc.next();
		EspacioPublico.setDireccion(direccionep);

		Ayuntamiento.imprimirAyu();
		Inmueble.imprimirInmu();
		EspacioPublico.imprimirEsPu();
		Habitante.imprimirHabi();
		Partido.imprimirParti();










		////Habitante.imprimirHabi2();
/*
		System.out.println("\n---Habitante---");
		System.out.println("DNI: " + habitante.getDni());
		System.out.println("Nombre: " + habitante.getNombre());
		System.out.println("Primer apellido: " + habitante.getApellido1());
		System.out.println("Segundo apellido: " + habitante.getApellido2());
		System.out.println("Sexo: " + habitante.getSexo());
		System.out.println("Edad: " + habitante.getEdad());
*/
		//Ayuntamiento.imprimirAyu();
		/*System.out.println("\n---Ayuntamiento---");
		System.out.println("Poblacion: " + ayuntamiento.getPoblacion());
		System.out.println("Localidad: " + ayuntamiento.getLocalidad());
		System.out.println("Alcalde: " + ayuntamiento.getAlcalde());*/

		//Inmueble.imprimirInmu();
/*
		System.out.println("\n---Inmueble---");
		System.out.println("Direccion: " + inmueble.getDireccion());
		System.out.println("Codigo postal: " + inmueble.getCodigoPostal());
		System.out.println("Numero de pisos: " + inmueble.getPisos());
*/
		//EspacioPublico.imprimirEsPu();
/*
		System.out.println("\n---Espacio publico---");
		System.out.println("Direccion: " + EspacioPublico.getDireccion());
		System.out.println("Extension: " + EspacioPublico.getExtension() + " metros cuadrados");
*/
		//Habitante.imprimirHabi();
/*
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
*/

		//Partido.imprimirParti();
/*
		System.out.println("\n---Partidos---");
		ArrayList<Partido> partidos = new ArrayList<Partido>();
		File archivo = new File("./listadoPartidos.txt");
		Scanner s = null;

		try {
			s = new Scanner(archivo);
			
			while (s.hasNextLine()) {
				String linea = s.nextLine();
				String[] palabra = linea.split(", ");
				Partido partidoel = new Partido();

				partidoel.setNombre(palabra[0]);
				partidoel.setSiglas(palabra[1]);
				partidoel.setPresidente(palabra[2]);
				partidoel.setNumeroAfiliados(palabra[3]);

				partidos.add(partidoel);
				
			}
			Iterator<Partido> itrPartidos = partidos.iterator();
			while(itrPartidos.hasNext()){
				Partido partido = itrPartidos.next();
				System.out.println("Nombre del partido: " + partido.getNombre());
				System.out.println("Siglas del partido: " + partido.getSiglas());
				System.out.println("Presidente del partido: " + partido.getPresidente());
				System.out.println("Numero de afiliados en el partido: " + partido.getNumeroAfiliados());
				System.out.println();
			}

		} catch (IOException ioe) {
			System.out.println("Error E/S: " + ioe);
		}
		*/

	}
}
