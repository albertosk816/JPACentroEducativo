package ejercicio05_AplicacionGestionEvaluacionEnCentro.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JMenuBar {

	/**
	 * 
	 */
	public Menu() {
		// Men� Archivo de la aplicaci�n
		JMenu menuArchivo = new JMenu("Entidades");

		JMenuItem miCursoAcademico = new JMenuItem("Curso acad�micos");
		miCursoAcademico.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JDialog dialogo = new JDialog();
				// evita cambio de tama�o
				dialogo.setResizable(false);
				// t�tulo del di�olog
				dialogo.setTitle("Gesti�n de cursos acad�micos");
				// dimensiones que ocupa en la pantalla
				dialogo.setBounds(100, 100, 450, 229);
				// capa que contendr� todo
				dialogo.setContentPane(new PanelGestionCursosAcademicos());
				dialogo.setModal(true);

				dialogo.setVisible(true);
			}
		});
		menuArchivo.add(miCursoAcademico);

		this.add(menuArchivo);

	}

}
