package proyecto_integrador_1;

import processing.core.PApplet;

public class Persona implements Comparable<Persona>{

	String nombre, datos;

	int colors[];
	private String[] nseparado;
	private String [] dseparado;
	
	
	
	public Persona(String nombre, String datos, String colores) {
		super();
		this.nombre = nombre;
		this.datos = datos;
		colors = new int[3];
		rgb(colores);
		
		
		nseparado = nombre.split(":");
		dseparado = datos.split("/");
		
	}
	
	public void rgb(String colores){
		
		String[] st = colores.split("/");
		
		for (int i = 0; i < st.length; i++) {
			
			colors[i]= Integer.valueOf(st[i]);
		}	
	}
	

	public void pintar(PApplet app, int x, int y){
	
			
		
		app.fill(colors[0],colors[1],colors[2]);
		app.text(nseparado[0] + nseparado[1] + dseparado[0] + dseparado[1] + dseparado[2],x ,y);
		
	}

	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//@Override
//	public int[] hashCode() {
//		return this.colors;
//	}

	@Override
	public boolean equals(Object obj) {
		
		Persona persona = (Persona) obj;
		
		return this.colors == persona.getColors();
	}

	public int[] getColors() {
		return colors;
	}

	public void setColors(int[] colors) {
		this.colors = colors;
	}

	
	
	

}
