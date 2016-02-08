/**
 * 
 */
package giti7083jaquelineinterfacefigura;

import java.util.List;

public class TestInterface implements Figura{

	private Cuadrado cuadrado;
	

	private Circulo circulo;
	
	
	private Triangulo triangulo;
	
	
	public TestInterface() {
	
		Cuadrado cuadrado = new Cuadrado();
		Circulo circulo= new Circulo();
		Triangulo triangulo = new Triangulo();
	}

}
