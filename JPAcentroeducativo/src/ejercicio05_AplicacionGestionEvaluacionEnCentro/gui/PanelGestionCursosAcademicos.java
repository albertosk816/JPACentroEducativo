package ejercicio05_AplicacionGestionEvaluacionEnCentro.gui;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import ejercicio05_AplicacionGestionEvaluacionEnCentro.modelo.Curso;
import ejercicio05_AplicacionGestionEvaluacionEnCentro.modelo.controladores.CursoControlador;
import ejercicio05_AplicacionGestionEvaluacionEnCentro.utils.CacheImagenes;

public class PanelGestionCursosAcademicos extends JPanel {


	public static int LOAD_FIRST = 0;
	public static int LOAD_PREV = 1;
	public static int LOAD_NEXT = 2;
	public static int LOAD_LAST = 3;
	public static int NEW = 4;
	public static int SAVE = 5;
	public static int REMOVE = 6;
	
	
	private JTextField jtfId = new JTextField(5);
	private JTextField jtfDescripcion = new JTextField(20);

	
	
	
	public PanelGestionCursosAcademicos() {
		super();
		this.setLayout(new BorderLayout());
		this.add(getBarraHerramientas(), BorderLayout.NORTH);
		this.add(getPanelGestion(), BorderLayout.CENTER);
	}

	
	/**
	 * 
	 */
	private JPanel getPanelGestion () {
		JPanel panelGestion = new JPanel();
		panelGestion.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		// Inclusi�n del JTextField para el Id
		c.gridx = 0;
	    c.gridy = 0;
	    c.insets = new Insets(5, 5, 5, 5);
	    c.anchor = GridBagConstraints.EAST;
	    panelGestion.add(new JLabel("Identificador: "), c);
		
		c.gridx = 1;
	    jtfId.setEnabled(false);
	    c.anchor = GridBagConstraints.WEST;
	    panelGestion.add(jtfId, c);

		// Inclusi�n del JTextField para la descripci�n
		c.gridx = 0;
	    c.gridy = 1;
	    c.anchor = GridBagConstraints.EAST;
	    panelGestion.add(new JLabel("Descripci�n: "), c);
		
		c.gridx = 1;
	    jtfId.setEnabled(false);
	    c.anchor = GridBagConstraints.WEST;
	    panelGestion.add(jtfDescripcion, c);

	    return panelGestion;
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	private JToolBar getBarraHerramientas() {
		JToolBar toolBar = new JToolBar();
		
		JButton jbtPrimero = new JButton();
		asignarFuncion(jbtPrimero, "gotostart.png", LOAD_FIRST);
		toolBar.add(jbtPrimero);

		JButton jbtPrevio = new JButton();
		asignarFuncion(jbtPrevio, "previous.png", LOAD_FIRST);
		toolBar.add(jbtPrevio);

		JButton jbtSiguiente = new JButton();
		asignarFuncion(jbtSiguiente, "next.png", LOAD_FIRST);
		toolBar.add(jbtSiguiente);

		JButton jbtUltimo = new JButton();
		asignarFuncion(jbtUltimo, "gotoend.png", LOAD_FIRST);
		toolBar.add(jbtUltimo);

		JButton jbtNuevo = new JButton();
		asignarFuncion(jbtNuevo, "nuevo.png", NEW);
		toolBar.add(jbtNuevo);

		JButton jbtGuardar = new JButton();
		asignarFuncion(jbtGuardar, "guardar.png", SAVE);
		toolBar.add(jbtGuardar);

		JButton jbtEliminar = new JButton();
		asignarFuncion(jbtEliminar, "eliminar.png", REMOVE);
		toolBar.add(jbtEliminar);

		return toolBar;
	}
	
	
	
	/**
	 * 
	 * @param jbt
	 * @param funcion
	 */
	private void asignarFuncion (JButton jbt, String icono, final int funcion) {
		jbt.setIcon(CacheImagenes.getCacheImagenes().getIcono(icono));
		jbt.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent arg0) {
				
				Curso obtenido = null;
				if (funcion == LOAD_FIRST) 
					obtenido = CursoControlador.getInstancia().findFirst();
//				if (funcion == LOAD_PREV) 
////					obtenido = ConcesionarioControlador.getControlador().findPrevious(actual);
//				if (funcion == LOAD_NEXT) 
////					obtenido = ConcesionarioControlador.getControlador().findNext(actual);
//				if (funcion == LOAD_LAST) 
////					obtenido = ConcesionarioControlador.getControlador().findLast();
//				if (funcion == NEW) 
////					nuevo();
//				if (funcion == SAVE) 
////					guardar();
//				if (funcion == REMOVE) 
////					obtenido = eliminar();
//				
////				if (obtenido != null) {
////					actual = obtenido;
////					cargarDatosActual();
//				}
			}});
	}

}