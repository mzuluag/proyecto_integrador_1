package proyecto_integrador_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import processing.core.PApplet;


public class Logica {
	
	ArrayList <Persona> personas;
	TreeSet<Persona> personas2;
	
	String[] nombres;

	String[] colores;

	String[] datos;
	
	
	Logica(PApplet app){
		
		nombres = app.loadStrings("../data/nombres.txt");
		datos = app.loadStrings("../data/datos.txt");
		colores = app.loadStrings("../data/colores.txt");
		personas = new ArrayList<Persona>();
		personas2 = new TreeSet<Persona>();
		crearPersonas();
	}
	
	

	public void pintar(PApplet app){
		
		for (int i = 0; i < personas.size(); i++) {
			personas.get(i).pintar(app,200,75+(40*i));
		}
			
		
		
	}
	
	public void recorrerTreeSet(PApplet app){
		Iterator<Persona> it = personas2.iterator();
		int i =0;
		while(it.hasNext()){
			Persona p = it.next();
			p.pintar(app, 200, 75+(40*i));
			i++;
		}
		
	}
	
	public void crearPersonas(){
		for (int i = 0; i < nombres.length; i++) {
			personas.add(new Persona(nombres[i],datos[i],colores[i]));
		}
	}
	
	public void teclas(PApplet app){
		
	
			if(app.key == '1'){
				if(!personas.isEmpty()){
					personas2.addAll(personas);
					personas.removeAll(personas2);
				}
				
			}
		
	}
	
	

}
