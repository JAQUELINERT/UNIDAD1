/**
 * 
 */
package giti7083jaquelinefutbol;

public class SeleccionFutbol implements IntegranteSeleccionFutbol { //CLASE QUE IMPLENETA OTRA CLASE
	private int id;
	private String nombre;
	private String apellidos; //ATRUBUTOS DE LA CLASE
	private int edad;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	public SeleccionFutbol() {

	}

}
