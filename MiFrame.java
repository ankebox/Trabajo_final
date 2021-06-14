package ultima_practica;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class MiFrame extends Frame {

	public MiFrame(String titulo, int ancho, int alto) {
		this.setSize(ancho, alto);
		this.setTitle(titulo);
		this.setVisible(true);
		this.setLocationRelativeTo(null);

		//Añadida funcionalidad para cerrar ventana
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});
	}


	
}