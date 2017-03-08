package proyecto_integrador_1;

import processing.core.PApplet;

public class Ejecutable extends PApplet {

		Logica log;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("proyecto_integrador_1.Ejecutable");

	}
	
	public void settings(){
		size(350,400);
	}
	
	public void setup(){
		log = new Logica(this);
		
	}
	
	public void draw(){
		background(0);
		log.pintar(this);
		
	}
	
	public void keyPressed(){
		
		log.teclas(this);
	}

}
