package ultima_practica;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;

public class Primero {
	/**
	 * Ejecuta el programa requerido en el ejercicio 1
	 */
	public void abrir() {
		MiFrame ejercicio1 = new MiFrame("Ventana tres", 700, 600);
		Panel panel1 = new Panel(new GridLayout(4, 5));
		ejercicio1.add(panel1);
		Panel panel2 = new Panel(new GridLayout(2, 2));
		Panel panel3 = new Panel(new GridLayout(1, 2));
		Panel panel4 = new Panel(new GridLayout(3, 1));
		Panel panel5 = new Panel(new GridLayout(1, 2));
		Panel panel6 = new Panel(new GridLayout(3, 1));
		Panel panel7 = new Panel(new GridLayout(1, 2));
		Panel panel8 = new Panel(new BorderLayout());
		Panel panel9 = new Panel(new GridLayout(1, 2));

		for (int i = 1; i < 21; i++) {
			int letra = 'A';
			switch (i) {
			case 1:
				panel1.add(panel2);
				for (int j = 1; j < 5; j++) {
					panel2.add(new Button("" + (char) letra));
					letra++;
				}
				break;
			case 5:
				panel1.add(panel3);
				for (int j = 1; j < 3; j++) {
					panel3.add(new Button("" + j));
				}
				break;
			case 7:
				panel1.add(panel4);
				for (int j = 1; j < 4; j++) {
					panel4.add(new Button("" + (char) letra));
					letra++;
				}
				break;
			case 10:
				panel1.add(panel5);
				for (int j = 1; j < 3; j++) {
					panel5.add(new Button("" + (char) letra));
					letra++;
				}
				break;
			case 13:
				panel1.add(panel6);
				for (int j = 1; j < 4; j++) {
					panel6.add(new Button("" + (char) letra));
					letra++;
				}
				break;
			case 15:
				panel1.add(panel7);
				for (int j = 1; j < 3; j++) {
					panel7.add(new Button("" + (char) letra));
					letra++;
				}
				break;
			case 19:
				panel1.add(panel8);
				panel8.add(new Button("A"), BorderLayout.NORTH);
				panel8.add(new Button("B"), BorderLayout.WEST);
				panel8.add(new Button("C"), BorderLayout.CENTER);
				panel8.add(new Button("D"), BorderLayout.EAST);
				panel8.add(new Button("E"), BorderLayout.SOUTH);
				break;
			case 20:
				panel1.add(panel9);
				for (int j = 1; j < 3; j++) {
					panel9.add(new Button("" + (char) letra));
					letra++;
				}
				break;
			default:
				panel1.add(new Button("" + i));
			}
		}
	}
}
