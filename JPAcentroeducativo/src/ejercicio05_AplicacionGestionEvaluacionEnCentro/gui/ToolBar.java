package ejercicio05_AplicacionGestionEvaluacionEnCentro.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

import ejercicio05_AplicacionGestionEvaluacionEnCentro.utils.CacheImagenes;


public class ToolBar extends JToolBar {

	private static final long serialVersionUID = 1L;

	public ToolBar() {
		JButton jbtCursosAcademicos = new JButton();
		jbtCursosAcademicos.setIcon(CacheImagenes.getCacheImagenes().getIcono("ruedadentada.png"));
		jbtCursosAcademicos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("quiere abrir el panel del curso acad�mico");
			}
		});
		this.add(jbtCursosAcademicos);
	}

}
