package ejercicio05_AplicacionGestionEvaluacionEnCentro;


import ejercicio05_AplicacionGestionEvaluacionEnCentro.gui.VentanaPrincipal;
//import ejercicio05_AplicacionGestionEvaluacionEnCentro.modelo.Curso;
//import ejercicio05_AplicacionGestionEvaluacionEnCentro.modelo.controladores.CursoControlador;

public class Principal {

	public static void main(String[] args) {
//		Curso curso = (Curso) CursoControlador.getInstancia().find(1);
//		System.out.println("Curso: " + curso.getDescripcion());

		VentanaPrincipal ventana = new VentanaPrincipal();
		ventana.setVisible(true);
	}

}
