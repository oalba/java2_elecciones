import java.util.*;
import java.io.*;

public class Elecciones {

	public static void main(String args[]) {

		String dni, nombre, apellido1, apellido2, sexo, poblacion, localidad, alcalde, direccioni, direccionep;
		int edad, codigopostal, pisos, extension;

		Habitante habitante = new Habitante();
		Ayuntamiento ayuntamiento = new Ayuntamiento();
		Inmueble inmueble = new Inmueble();
		EspacioPublico espu = new EspacioPublico();
		Partido partido = new Partido();
	/*	
		Scanner sc = new Scanner(System.in);
		System.out.print("\nIntroduce los siguientes datos del habitante: \n");
		System.out.print("DNI: ");
		dni = sc.next();
		habitante.setDni(dni);
		System.out.print("Nombre: ");
		nombre = sc.next();
		habitante.setNombre(nombre);
		System.out.print("Primer apellido: ");
		apellido1 = sc.next();
		habitante.setApellido1(apellido1);
		System.out.print("Segundo apellido: ");
		apellido2 = sc.next();
		habitante.setApellido2(apellido2);
		System.out.print("Sexo (Hombre o Mujer): ");
		sexo = sc.next();
		habitante.setSexo(sexo);
		System.out.print("Edad: ");
		edad = sc.nextInt();
		habitante.setEdad(edad);

		System.out.print("\nIntroduce los siguientes datos del ayuntamiento: \n");
		System.out.print("Poblacion: ");
		poblacion = sc.next();
		ayuntamiento.setPoblacion(poblacion);
		System.out.print("Localidad: ");
		localidad = sc.next();
		ayuntamiento.setLocalidad(localidad);
		System.out.print("Nombre del alcalde: ");
		alcalde = sc.next();
		ayuntamiento.setAlcalde(alcalde);

		System.out.print("\nIntroduce los siguientes datos del inmueble: \n");
		System.out.print("Direccion: ");
		direccioni = sc.next();
		inmueble.setDireccion(direccioni);
		System.out.print("Codigo postal: ");
		codigopostal = sc.nextInt();
		inmueble.setCodigoPostal(codigopostal);
		System.out.print("Numero de pisos: ");
		pisos = sc.nextInt();
		inmueble.setPisos(pisos);

		System.out.print("\nIntroduce los siguientes datos de un espacio publico: \n");
		System.out.print("Extension (metros cuadrados): ");
		extension = sc.nextInt();
		espu.setExtension(extension);
		System.out.print("Direccion: ");
		direccionep = sc.next();
		espu.setDireccion(direccionep);

		System.out.println("\n---Habitante---");
		System.out.println("DNI: " + habitante.getDni());
		System.out.println("Nombre: " + habitante.getNombre());
		System.out.println("Primer apellido: " + habitante.getApellido1());
		System.out.println("Segundo apellido: " + habitante.getApellido2());
		System.out.println("Sexo: " + habitante.getSexo());
		System.out.println("Edad: " + habitante.getEdad());

		System.out.println("\n---Ayuntamiento---");
		System.out.println("Poblacion: " + ayuntamiento.getPoblacion());
		System.out.println("Localidad: " + ayuntamiento.getLocalidad());
		System.out.println("Alcalde: " + ayuntamiento.getAlcalde());

		System.out.println("\n---Inmueble---");
		System.out.println("Direccion: " + inmueble.getDireccion());
		System.out.println("Codigo postal: " + inmueble.getCodigoPostal());
		System.out.println("Numero de pisos: " + inmueble.getPisos());

		System.out.println("\n---Espacio publico---");
		System.out.println("Direccion: " + espu.getDireccion());
		System.out.println("Extension: " + espu.getExtension() + " metros cuadrados");
*/
/*

String colores = "rojo,amarillo,verde,azul,morado,marrón";
String[] arrayColores = colores.split(",");
 
// En este momento tenemos un array en el que cada elemento es un color.
for (int i = 0; i < arrayColores.length; i++) {
	System.out.println(arrayColores[i]);
}

*/
//String[] palabra = linea.split(",");

		try {
			String linea;
			File archivo = new File("/home/zubiri/AriketakJava/java2_elecciones/src/listadoPartidos.txt");
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			ArrayList <String> partidos = new ArrayList <String>();
			linea = br.readLine();
String[] palabra = linea.split(",");
			System.out.println("\n---Partidos---");
			while (linea != null) {
				partidos.add(linea);
				//String[] palabra = linea.split(",");
				//ArrayList <String> palabra = new ArrayList <String>(Arrays.asList(linea.split(",")));
				linea = br.readLine();
			}
			partido.setNombre(palabra[0]);
			partido.setSiglas(palabra[1]);
			partido.setPresidente(palabra[2]);
			partido.setNumeroAfiliados(palabra[3]);
			System.out.println(partido.getNombre());
			System.out.println("Listado de partidos:");
			for(int i=0; i<partidos.size(); i++)
			{
				System.out.println(partidos.get(i));
			}

			partidos.clear();

		} catch (IOException ioe) {
			System.out.println("Error E/S: " + ioe);
		}

	}
}
