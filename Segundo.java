package ultima_practica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Checkbox;

public class Segundo {

	/**
	 * Ejecuta el programa requerido en el ejercicio 2
	 */
	public void abrir() {
		MiFrame ventana = new MiFrame("Ejercicio dos", 500, 400);
		Panel panel = new Panel(new BorderLayout());
		Label titulo = new Label("Registration Form", Label.CENTER);
		Panel panel2 = new Panel();
		Panel panel3 = new Panel(new GridLayout(7, 1));
		Panel panel4 = new Panel(new GridLayout(1, 2));
		Label nombre = new Label("Name", Label.CENTER);
		Panel panel5 = new Panel(new BorderLayout());
		Panel panel6 = new Panel();
		TextField textField = new TextField();
		Panel panel7 = new Panel(new GridLayout(1, 2));
		Label movil = new Label("Mobile", Label.CENTER);
		Panel panel8 = new Panel(new BorderLayout());
		Panel panel9 = new Panel();
		TextField textField_1 = new TextField();
		Panel panel10 = new Panel(new GridLayout(1, 2));
		Panel panel_11 = new Panel();
		Label sexo = new Label("Gender");
		Panel panel_14 = new Panel();
		Checkbox checkbox_1 = new Checkbox("Female");
		Checkbox checkbox = new Checkbox("Male");
		Label genero = new Label("Gender", Label.CENTER);
		TextArea textArea = new TextArea();

		ventana.add(panel);
		panel.setBackground(new Color(238, 238, 238));
		panel.add(titulo, BorderLayout.NORTH);
		titulo.setFont(new Font("Arial", Font.BOLD, 22));
		panel.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(null);
		panel3.setBounds(0, 0, 242, 428);
		panel2.add(panel3);
		panel3.add(panel4);
		nombre.setFont(new Font("Arial", Font.BOLD, 14));
		panel4.add(panel5);
		panel5.add(nombre, BorderLayout.SOUTH);
		panel4.add(panel6);
		panel6.setLayout(null);
		textField.setBounds(0, 38, 93, 23);
		panel6.add(textField);
		panel3.add(panel7);
		movil.setFont(new Font("Arial", Font.BOLD, 14));
		panel7.add(panel8);
		panel8.add(movil, BorderLayout.SOUTH);
		panel7.add(panel9);
		panel9.setLayout(null);
		textField_1.setBounds(0, 38, 93, 23);
		panel9.add(textField_1);
		panel3.add(panel10);
		panel10.add(panel_11);
		panel_11.add(sexo);
		sexo.setFont(new Font("Arial", Font.BOLD, 14));
		panel10.add(panel_14);
		panel_14.add(checkbox_1);
		panel_14.add(checkbox);
		genero.setFont(new Font("Arial", Font.BOLD, 14));
		textArea.setBounds(242, 0, 242, 241);
		panel2.add(textArea);
	}
}