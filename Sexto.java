package ultima_practica;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Sexto {
	private boolean llamada = false;

	/**
	 * Ejecuta el programa requerido en el ejercicio 6
	 */
	public void abrir() {

		MiFrame ejercicio6 = new MiFrame("Ejercicio seis", 400, 400);
		Panel panel1 = new Panel(new GridLayout(5, 1));
		Panel panel2 = new Panel(new GridLayout(1, 1));
		Panel panel3 = new Panel(new GridLayout(1, 3));
		Panel panel4 = new Panel(new GridLayout(1, 3));
		Panel panel5 = new Panel(new GridLayout(1, 3));
		Panel panel6 = new Panel(new GridLayout(1, 3));
		TextField texto = new TextField();
		Button boton1 = new Button("1");
		Button boton2 = new Button("2");
		Button boton3 = new Button("3");
		Button boton4 = new Button("4");
		Button boton5 = new Button("5");
		Button boton6 = new Button("6");
		Button boton7 = new Button("7");
		Button boton8 = new Button("8");
		Button boton9 = new Button("9");
		Button boton10 = new Button("0");
		Button botonLimpiar = new Button("CLEAR");
		Button botonLLamar = new Button("CALL");

		ejercicio6.add(panel1);
		panel1.add(panel2);
		panel2.add(texto);
		panel1.add(panel3);
		panel1.add(panel4);
		panel1.add(panel5);
		panel1.add(panel6);
		panel3.add(boton1);
		panel3.add(boton2);
		panel3.add(boton3);
		panel4.add(boton4);
		panel4.add(boton5);
		panel4.add(boton6);
		panel5.add(boton7);
		panel5.add(boton8);
		panel5.add(boton9);
		panel6.add(botonLimpiar);
		panel6.add(boton10);
		panel6.add(botonLLamar);

		boton1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent i) {
				String text = texto.getText();
				texto.setText(text + "1");
			}
		});

		boton2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent i) {
				String text = texto.getText();
				texto.setText(text + "2");
			}
		});

		boton3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent i) {
				String text = texto.getText();
				texto.setText(text + "3");
			}
		});

		boton4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent i) {
				String text = texto.getText();
				texto.setText(text + "4");
			}
		});

		boton5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent i) {
				String text = texto.getText();
				texto.setText(text + "5");
			}
		});

		boton6.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent i) {
				String text = texto.getText();
				texto.setText(text + "6");
			}
		});

		boton7.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent i) {
				String text = texto.getText();
				texto.setText(text + "7");
			}
		});

		boton8.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent i) {
				String text = texto.getText();
				texto.setText(text + "8");
			}
		});

		boton9.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent i) {
				String text = texto.getText();
				texto.setText(text + "9");
			}
		});

		boton10.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent i) {
				String text = texto.getText();
				texto.setText(text + "0");
			}
		});

		botonLimpiar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent i) {
				texto.setText("");
			}
		});

		botonLLamar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent i) {
				if (llamada) {
					botonLLamar.setLabel("HANG UP");
					llamada = false;
				} else {
					botonLLamar.setLabel("CALL");
					llamada = true;
				}
			}
		});
	}
}