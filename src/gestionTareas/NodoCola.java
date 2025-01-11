package gestionTareas;

public class NodoCola {
	String descripcion;
	NodoCola siguiente;
	
	
	public NodoCola(String descripcion) {
		this.descripcion = descripcion;
		this.siguiente = null;
	}
	
}
