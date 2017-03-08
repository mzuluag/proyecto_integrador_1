package proyecto_integrador_1;

import processing.core.PApplet;

public class Persona implements Comparable<Persona>{

	String nombre,apellido,cedula,datos;

	

	int edad,peso,r,g,b;
	int sumaColor;
	
	public Persona(String nombre, String datos,String colores) {
		
		String colors[] = colores.split("/");
		rgb(colors);
		String[] nseparado = nombre.split(":");
		this.apellido = nseparado[1];
		this.nombre = nseparado[0];		
		String[] dseparado = datos.split("/");	
		this.cedula = dseparado[0];
		this.edad = Integer.valueOf(dseparado[1]);
		this.peso = Integer.valueOf(dseparado[2]);
		this.sumaColor=r+g+b;
		
		
	}
	
	public int getSumaColor() {
		return sumaColor;
	}

	public void setSumaColor(int sumaColor) {
		this.sumaColor = sumaColor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getDatos() {
		return datos;
	}

	public void setDatos(String datos) {
		this.datos = datos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void rgb(String[] colores){

			this.r= Integer.valueOf(colores[0]);
			this.g= Integer.valueOf(colores[1]);
			this.b= Integer.valueOf(colores[2]);
		
	}
	

	
	
	public void pintar(PApplet app, int x, int y){
		
		app.fill(r,g,b);
	    app.text(nombre+" " + apellido+"   " + cedula+"   " + edad+"   " + peso,x ,y);
		
	}

	@Override
	public int compareTo(Persona o) {
		
		if(this.apellido.equals(o.getApellido())){
			return 0;	
		}else{
			return this.apellido.compareTo(o.getApellido());
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public int hashCode() {		
		return  this.sumaColor;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (sumaColor != other.sumaColor)
			return false;
		return true;
	}
	
	
	
	
	
}
