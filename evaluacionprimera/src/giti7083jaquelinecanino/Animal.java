/**
 * 
 */
package giti7083jaquelinecanino;

public class Animal { //clase animal padre
	private String foto;
	private String tipo_Comida;
	private String localizacion; //atributos de la clase
	private String tamanio;

	public Package hacerRuido(){
		return null;	
	}
	public Package comer(){
		return null;
	}
	public void dormir(){	
	}
	public Package rugir(){
		return null;
		
	}
	public String getFoto() {
		return foto; //retorna una foto
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getTipo_Comida() {
		return tipo_Comida;
	}
	
	public void setTipo_Comida(String tipo_Comida) {
		this.tipo_Comida = tipo_Comida; //retorna,,,
	}
	public String getLocalizacion() {
		return localizacion;
	}
	
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
}
