package ultima_practica;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tercero {
	/**
	 * Ejecuta el programa requerido en el ejercicio 3
	 */
	public void abrir() {
		MiFrame ejercicio3 = new MiFrame("Ejercicio tres", 700, 200);
		Panel panel1 = new Panel(new GridLayout(1, 3));
		ejercicio3.add(panel1);
		Button boton1 = new Button("Boton numero 1");
		Button boton2 = new Button("Boton numero 2");
		Label etiqueta = new Label("Pulsa un boton");
		panel1.add(boton1);
		panel1.add(etiqueta);
		panel1.add(boton2);
		boton2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				etiqueta.setText("Se ha pulsado el boton numero 2");
				
			}
		});
		boton1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				etiqueta.setText("Se ha pulsado el boton numero 1");
			}
		});
	}
}
