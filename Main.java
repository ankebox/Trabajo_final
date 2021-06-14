package ultima_practica;
import java.util.Scanner;

public class Main {
	static Scanner sn = new Scanner(System.in);

	/**
	 * Main del programa ejecuta las otras clases y sus metodos
	 */
	public static void main(String[] args) {
		boolean salir = false;
		int opcion;
		while (!salir) {
			System.out.println("1. Primero ");
			System.out.println("2. Segundo");
			System.out.println("3. Tercero");
			System.out.println("4. Cuarto");
			System.out.println("5. Quinto");
			System.out.println("6. Sexto");
			System.out.println("7. Septimo");
			System.out.println("8. Octavo");
			System.out.println("9. Salir");
			opcion = sn.nextInt();
			switch (opcion) {
			case 1:
				Primero primero = new Primero();
				primero.abrir();
				break;
			case 2:
				Segundo segundo = new Segundo();
				segundo.abrir();
				break;
			case 3:
				Tercero tercero = new Tercero();
				tercero.abrir();
				break;
				
			case 4:
				Cuarto cuarto = new Cuarto();
				cuarto.abrir();
				break;
			case 5:
				Quinto quinto = new Quinto();
				quinto.abrir();
				break;
			case 6:
				Sexto sexto = new Sexto();
				sexto.abrir();
				break;
			case 7:
				Septimo septimo = new Septimo();
				septimo.abrir();
				break;
			case 8:
				Octavo octavo = new Octavo();
				octavo.abrir();
				break;
			case 9:
				System.out.println("Salir");
			default:
				System.out.println("Las Opciones son entre 1 y 9");
			}
		}
	}
}
