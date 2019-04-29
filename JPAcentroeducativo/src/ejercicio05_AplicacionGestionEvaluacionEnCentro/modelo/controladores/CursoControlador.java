package ejercicio05_AplicacionGestionEvaluacionEnCentro.modelo.controladores;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import ejercicio05_AplicacionGestionEvaluacionEnCentro.modelo.Curso;

public class CursoControlador extends Controlador {

	// instancia del singleton
	private static CursoControlador instancia = null;

	/**
	 * 
	 */
	public CursoControlador() {
		super("Curso");
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @return
	 */
	public static CursoControlador getInstancia() {
		if (instancia == null) {
			instancia = new CursoControlador();
		}
		return instancia;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public Curso findFirst () {
		try {
			EntityManager em = getEntityManagerFactory().createEntityManager();
			Query q = em.createQuery("SELECT c FROM Curso c order by c.id", Curso.class);
			Curso resultado = (Curso) q.setMaxResults(1).getSingleResult();
			em.close();
			return resultado;
		}
		catch (NoResultException nrEx) {
			return null;
		}
	}
}
