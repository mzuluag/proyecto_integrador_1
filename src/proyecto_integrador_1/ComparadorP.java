package proyecto_integrador_1;

import java.util.Comparator;

public class ComparadorP implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		return o1.getPeso()  - (o2.getPeso());
	}
	

}
