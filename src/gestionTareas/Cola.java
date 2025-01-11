package gestionTareas;

public class Cola {
	private NodoCola frente;
	private NodoCola fin;
	
	
	public Cola() {
		this.frente = null;
		this.fin = null;
	}
	
	
	public void tareasCompletadas(String descripcion) {
		NodoCola tareaLista = new NodoCola(descripcion);
		if (estaVacia()) {
			frente = tareaLista;
			fin = tareaLista;
		} else {
			fin.siguiente = tareaLista;
			fin = tareaLista;
		}
	}
	
	
	public void verTareasPendientes() {
		if (frente == null) {
			System.out.println("No se ha completado ninguna tarea aun");
			return;
		}
		
		NodoCola actual = frente;
		System.out.println("Tareas completadas: ");
		while (actual != null) {
			System.out.println("- " + actual.descripcion);
			actual = actual.siguiente;
		}
	}
	
	
	public boolean estaVacia() {
		return frente == null;
	}
	
}
