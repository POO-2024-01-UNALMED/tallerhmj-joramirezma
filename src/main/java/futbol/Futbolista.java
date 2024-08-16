package main.java.futbol;

public class Futbolista implements Comparable{
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	
	public Futbolista() {
		this("Maradona", 30, "Delantero");
	}
	
	@Override
	public String toString() {
		return "El futbolista " + nombre+  " tiene " +edad+ ", y juega de "+posicion;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
