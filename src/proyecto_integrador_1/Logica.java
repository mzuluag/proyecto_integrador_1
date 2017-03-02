package proyecto_integrador_1;

import java.util.ArrayList;

import processing.core.PApplet;


public class Logica {
	
	ArrayList <Persona> personas;
	
	String[] nombres;
	
	
	String[] colores;
	
	
	String[] datos;
	
	
	Logica(PApplet app){
		
		nombres = app.loadStrings("../data/nombres.txt");
		datos = app.loadStrings("../data/datos.txt");
		colores = app.loadStrings("../data/colores.txt");
		personas = new ArrayList<Persona>();
		crearPersonas();
	}
	
	

	public void pintar(PApplet app){
		
		for (int i = 0; i < personas.size(); i++) {
			personas.get(i).pintar(app,200,75+(40*i));
		}
			
		
		
	}
	
	public void crearPersonas(){
		for (int i = 0; i < nombres.length; i++) {
			personas.add(new Persona(nombres[i],datos[i],colores[i]));
		}
	}
	
	public void teclas(){
		
		
	}
	
	

}
