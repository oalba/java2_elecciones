import java.util.Scanner;

public class Elecciones {

	public static void main(String args[]) {


		String result, dni, nombre, apellido1, apellido2, sexo;
		int edad;

		Habitante habitante = new Habitante();
		
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

		
		
		result = habitante.getDni();
		System.out.println("\nDNI: " + result);
		result = habitante.getNombre();
		System.out.println("Nombre: " + result);
		result = habitante.getApellido1();
		System.out.println("Primer apellido: " + result);
		result = habitante.getApellido2();
		System.out.println("Segundo apellido: " + result);
		result = habitante.getSexo();
		System.out.println("Sexo: " + result);
		edad = habitante.getEdad();
		System.out.println("Edad: " + edad);

	}
}
