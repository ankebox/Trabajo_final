package ultima_practica;

import java.awt.*;
import java.awt.event.*;

public class Septimo {

	private int count = 0;
	private TextField mostrar = new TextField();

	/**
	 * Ejecuta el programa requerido en el ejercicio 7
	 */
	public void abrir() {
		
		MiFrame ejercicio7 = new MiFrame("Ejercicio siete", 300, 100);
		Panel panel1 = new Panel(new GridLayout(1, 4));
		ejercicio7.add(panel1);
		Button boton1 = new Button("Cuenta");
		Button boton2 = new Button("Cuenta");

		Label contador = new Label("Contador");
		contador = new Label("Counter");
		panel1.add(contador);
		mostrar = new TextField(count + "", 10);
		mostrar.setEditable(false);
		panel1.add(mostrar);
		boton1 = new Button("Count");
		boton2 = new Button("Count");
		panel1.add(boton1);
		panel1.add(boton2);
		mostrar.setText(("" + count));
		
		boton1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent i) {
				count++;
				mostrar.setText(("" + count));
			}
		});
		
		boton2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent i) {
				count++;
				mostrar.setText(("" + count));
			}
		});
		

	}

}
