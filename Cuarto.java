package ultima_practica;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Cuarto {
	/**
	 * Ejecuta el programa requerido en el ejercicio 4
	 */
	public void abrir() {
		MiFrame ejercicio4 = new MiFrame("Ejercicio cuatro", 900, 600);
		Panel panel1 = new Panel(new GridLayout(4, 2));
		ejercicio4.add(panel1);
		TextField cajaNumero1 = new TextField(2);
		TextField cajaNumero2 = new TextField(2);
		Label conclusion = new Label("Introduce los dos numeros si dejas vacio un campo este valdra 0");
		Button boton1 = new Button("Evaluar");

		panel1.add(new Label("Primer numero:"));
		panel1.add(cajaNumero1);
		panel1.add(new Label("Segundo numero:"));
		panel1.add(cajaNumero2);
		panel1.add(new Label("Pulse el boton para comparar "));
		panel1.add(boton1);
		panel1.add(new Label("El numero mas grande es :"));
		panel1.add(conclusion);
		boton1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int numero1 = 0;
				int numero2 = 0;
				int masGrande = 0;

				numero1 = Integer.parseInt(cajaNumero1.getText());
				numero2 = Integer.parseInt(cajaNumero2.getText());

				if (numero1 == numero2) {
					conclusion.setText(("Ambos numeros son iguales "));

				} else if (numero1 > numero2) {
					masGrande = numero1;
					conclusion.setText(("" + masGrande));
				} else if (numero2 > numero1) {
					masGrande = numero2;
					conclusion.setText(("" + masGrande));
				}

			}
		});

	}

}
