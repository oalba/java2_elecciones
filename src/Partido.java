import java.util.*;
import java.io.*;

class Partido {
	private String nombre;
	private String siglas;
	private String presidente;
	private String numeroAfiliados;

	void setNombre (String nom){
		nombre = nom;
	}
	String getNombre(){
		return nombre;
	}

	void setSiglas (String sig){
		siglas = sig;
	}
	String getSiglas(){
		return siglas;
	}

	void setPresidente (String pre){
		presidente = pre;
	}
	String getPresidente(){
		return presidente;
	}

	void setNumeroAfiliados (String na){
		numeroAfiliados = na;
	}
	String getNumeroAfiliados(){
		return numeroAfiliados;
	}

	static void imprimirParti(){
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
	}
}
