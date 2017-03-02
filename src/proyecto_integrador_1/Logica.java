package proyecto_integrador_1;

import processing.core.PApplet;

public class Logica {
	PApplet app;
	String[] nombres;
	String[] color;
	String[] datos;
	
	Logica(PApplet app){
		this.app=app;
		nombres = app.loadStrings("../data/nombres.txt");
		datos = app.loadStrings("../data/datos.txt");
		nombres = app.loadStrings("../data/nombres.txt");
		PApplet.printArray(datos);
	}
	
	public void pintar(PApplet app){
		
	}
	
	

}
