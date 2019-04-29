package ejercicio05_AplicacionGestionEvaluacionEnCentro.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 * The persistent class for the profesor database table.
 * 
 */
@Entity
@NamedQuery(name = "Profesor.findAll", query = "SELECT p FROM Profesor p")
public class Profesor extends Entidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "apellido1")
	private String primerApellido;

	@Column(name = "apellido2")
	private String segundoApellido;

	private String direccion;

	private String dni;

	private String email;

	private String nombre;

	private String telefono;

	// bi-directional many-to-one association to Valoracionmateria
	@OneToMany(mappedBy = "profesor")
	private List<Valoracionmateria> valoracionMaterias;

	public Profesor() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrimerApellido() {
		return this.primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return this.segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Valoracionmateria> getValoracionMaterias() {
		return this.valoracionMaterias;
	}

	public void setValoracionMaterias(List<Valoracionmateria> valoracionMaterias) {
		this.valoracionMaterias = valoracionMaterias;
	}

	public Valoracionmateria addValoracionMateria(Valoracionmateria valoracionMateria) {
		getValoracionMaterias().add(valoracionMateria);
		valoracionMateria.setProfesor(this);

		return valoracionMateria;
	}

	public Valoracionmateria removeValoracionMateria(Valoracionmateria valoracionMateria) {
		getValoracionMaterias().remove(valoracionMateria);
		valoracionMateria.setProfesor(null);

		return valoracionMateria;
	}

}