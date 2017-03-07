package proyecto_integrador_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import processing.core.PApplet;

public class Logica {

	ArrayList<Persona> personas;
	TreeSet<Persona> personas2;
	TreeSet<Persona> personas3;
	TreeSet<Persona> personas4;

	String[] nombres;
	String[] colores;
	String[] datos;

	Logica(PApplet app) {

		nombres = app.loadStrings("../data/nombres.txt");
		datos = app.loadStrings("../data/datos.txt");
		colores = app.loadStrings("../data/colores.txt");
		personas = new ArrayList<Persona>();
		personas2 = new TreeSet<Persona>();
		personas3 = new TreeSet<Persona>(new ComparadorE());
		personas4 = new TreeSet<Persona>(new ComparadorP());
		crearPersonas();

	}

	public void pintar(PApplet app) {

		for (int i = 0; i < personas.size(); i++) {
			personas.get(i).pintar(app, 50, 75 + (40 * i));
		}
		recorrerTreeSet(app);
		recorrerTreeSet2(app);
		recorrerTreeSet3(app);

	}

	public void recorrerTreeSet(PApplet app) {
		Iterator<Persona> it = personas2.iterator();
		int i = 0;
		while (it.hasNext()) {
			Persona p2 = it.next();
			p2.pintar(app, 200, 75 + (40 * i));
			i++;
		}
	}

	public void recorrerTreeSet2(PApplet app) {
		Iterator<Persona> it = personas3.iterator();
		int i = 0;
		while (it.hasNext()) {
			Persona p3 = it.next();
			p3.pintar(app, 350, 75 + (40 * i));
			i++;
		}
	}

	public void recorrerTreeSet3(PApplet app) {
		Iterator<Persona> it = personas4.iterator();
		int i = 0;
		while (it.hasNext()) {
			Persona p = it.next();
			p.pintar(app, 200, 75 + (40 * i));
			i++;
		}

	}

	public void crearPersonas() {
		for (int i = 0; i < nombres.length; i++) {
			personas.add(new Persona(nombres[i], datos[i], colores[i]));
		}
	}

	public void teclas(PApplet app) {

		switch (app.key) {
		case '1':
			if (!personas.isEmpty()) {
				personas2.addAll(personas);
				personas.removeAll(personas2);
			}
			if (!personas3.isEmpty()) {
				personas2.addAll(personas3);
				personas3.removeAll(personas2);

			}

			break;

		case '2':
			if(!personas.isEmpty()){
			personas4.addAll(personas);
			personas.removeAll(personas4);
			}
			

			break;

		case '3':
			if (!personas.isEmpty()) {
				personas3.addAll(personas);
				personas.removeAll(personas3);
			}
			if (!personas2.isEmpty()) {
				personas3.addAll(personas2);
				personas2.removeAll(personas3);

			}
			
			if(!personas4.isEmpty()){
				personas3.addAll(personas4);
				personas4.removeAll(personas3);
				
			}
			break;
		}
	}
}
