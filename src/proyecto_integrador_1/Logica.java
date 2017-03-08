package proyecto_integrador_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import processing.core.PApplet;

public class Logica {

	ArrayList<Persona> personas;
	TreeSet<Persona> personas2;
	TreeSet<Persona> personas3;
	HashSet<Persona> personas4;
	int pantalla = 0;
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
		personas4 = new HashSet<Persona>();
		crearPersonas();

	}

	public void pintar(PApplet app) {

		app.background(0);
		switch (pantalla) {

		case 0:
			for (int i = 0; i < personas.size(); i++) {
				personas.get(i).pintar(app, 10, 20 + (40 * i));

			}
			break;
		case 1:

			personas2.addAll(personas);
			recorrerTreeSet(app);
			break;

		case 2:

			Collections.sort(personas, new ComparadorP());
			for (int i = 0; i < personas.size(); i++) {
				personas.get(i).pintar(app, 10, 20 + (40 * i));

			}

			break;

		case 3:

			personas3.addAll(personas);
			recorrerTreeSet2(app);

			break;

		case 4:

			personas4.addAll(personas);
			recorrerHashSet(app);

			break;

		}
	}

	public void recorrerTreeSet(PApplet app) {
		Iterator<Persona> it = personas2.iterator();
		int i = 0;
		while (it.hasNext()) {
			Persona p2 = it.next();
			p2.pintar(app, 10, 20 + (40 * i));
			i++;
		}
	}

	public void recorrerTreeSet2(PApplet app) {
		Iterator<Persona> it = personas3.iterator();
		int i = 0;
		while (it.hasNext()) {
			Persona p3 = it.next();
			p3.pintar(app, 10, 20 + (40 * i));
			i++;
		}
	}

	public void recorrerHashSet(PApplet app) {
		Iterator<Persona> it = personas4.iterator();
		int i = 0;
		while (it.hasNext()) {
			Persona p3 = it.next();
			p3.pintar(app, 10, 20 + (40 * i));
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
			pantalla = 1;
			break;
		case '2':
			pantalla = 2;
			break;

		case '3':
			pantalla = 3;
			break;

		case '4':
			pantalla = 4;
			break;
		}

	}

}
