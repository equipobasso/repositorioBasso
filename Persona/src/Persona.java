/**
 * 
 * @author usuario
 * Clase persona
 */
public class Persona {
	/**
	 *Atributos de la clase persona
	 */
	private String nombre;
	private int edad;
	private String nacionalidad;
	/**
	 * Constructor clase Persona
	 * @param nombre
	 * @param edad
	 * @param nacionalidad
	 */
	public Persona(String nombre, int edad, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
	}
	/**
	 * Obtenemos el nombre.
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Asignamos un nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 *Obtenemos la edads
	 * @return
	 */

	public int getEdad() {
		return edad;
	}
	/**
	 * Asignamos la edad
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * Obtenemos la nacionalidad
	 * @return
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}
	/**
	 * Asignamos la nacionalidad
	 * @param nacionalidad
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
}
