package ultima_practica;

import java.awt.*;
import java.awt.event.*;

public class Quinto {
	private int count = 0;
	private TextField mostrar = new TextField();

	/**
	 * Ejecuta el programa requerido en el ejercicio 5
	 */
	public void abrir() {
		MiFrame ejercicio5 = new MiFrame("Ejercicio cinco", 300, 100);
		Panel panel1 = new Panel(new GridLayout(1, 3));
		ejercicio5.add(panel1);
		Button boton1 = new Button("Cuenta");
		Label contador = new Label("Contador");
		contador = new Label("Counter");
		panel1.add(contador);
		mostrar = new TextField(count + "", 10);
		mostrar.setEditable(false);
		panel1.add(mostrar);
		boton1 = new Button("Count");
		panel1.add(boton1);
		mostrar.setText(("" + count));
		boton1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent i) {
				count++;
				mostrar.setText(("" + count));
			}
		});
	}
}
