/**
 * 
 */
package giti7083jaquelineproyecto;

import java.util.Date;
import java.util.List;

public class Presupuestos { //CLASE

	private List<DeptoComercial> valida;
	private Cliente cliente;
	private Date fecha;
	private String descipcion;
	private Double importe;
	private String estado;   //ATRBUTOS
	private Comercial calcula;
	private List<Viaje> tiene;
    private List<Proyecto> proyectos;

	public Presupuestos(IConsutarEstado consutarEstado, Cliente cliente,
			Viaje viaje, Proyecto proyecto) {

	}

}
