package ejercicio05_AplicacionGestionEvaluacionEnCentro.modelo.controladores;

public class MateriaControlador extends Controlador{



	// instancia del singleton
	private static MateriaControlador instancia = null;

	/**
	 * 
	 */
	public MateriaControlador() {
		super("Materia");
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @return
	 */
	public static <instancia> MateriaControlador getInstancia() {
		if (instancia == null) {
			instancia = new MateriaControlador();
		}
		return instancia;
	}
	

}
