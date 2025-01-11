package gestionTareas;

public class Modelo {

	private Pila pila;
	private Cola colaCompletadas;
	
	
	public Modelo() {
		this.pila = new Pila();
		this.colaCompletadas = new Cola();
	}
	
	// Metodos para interactuar con la pila
	public void agregarTarea(String descripcion) {
		pila.AgregarTarea(descripcion);
	}
	
	
	public String eliminarTarea() {
	        return pila.eliminarTarea();
	}
	
	
	public String verTareasPendientes() {
		if (pila.estaVacia()) {
			return "No hay tareas pendientes";
		}
		
		StringBuilder tareas = new StringBuilder();
		Nodo actual = pila.getCima();
		while (actual != null) {
			tareas.append("- ").append(actual.descripcion).append("\n");
			actual = actual.siguiente;
		}
		return tareas.toString();
	}
	
	
	public String proximaTarea() {
		return pila.proximaTarea();
	}
	
	// Metodos para interactuar con la cola
	public void marcarTareaCompletada() {
		pila.marcarTareaCompletada();
	}
	
	public void verTareasCompletadas() {
		colaCompletadas.verTareasPendientes();
	}
}
