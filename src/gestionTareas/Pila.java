package gestionTareas;

public class Pila {
	private Nodo cima;
	private Cola colaCompletadas;
	
	
	public Pila() {
		this.cima = null;
		this.setColaCompletadas(new Cola());
	}
	
	
	// Agregar tarea
	public void AgregarTarea (String descripcion) {
		Nodo nuevaTarea = new Nodo(descripcion);
		if (cima == null) {
			cima = nuevaTarea;
		} else {
			nuevaTarea.siguiente = cima;
			cima = nuevaTarea;
		}
	}
	
	// Eliminar tarea
	public String eliminarTarea() {
		if (estaVacia()) {
			return "\nNo hay tareas agregadas para eliminar";
		}
		
		String descripcion = cima.descripcion;
		cima = cima.siguiente;
		return "\nLa tarea: " + descripcion + " ha sido eliminada correctamente";
	}
	
	
	public boolean estaVacia() {
		return cima == null;
	}
	
	
	// Ver tareas pendientes
	public void verTareasPendientes() {
	    if (cima == null) {
	        System.out.println("No hay tareas agregadas aun");
	        return;
	    }
	    Nodo actual = cima;
	    System.out.println("Tareas pendientes:");
	    while (actual != null) {
	        System.out.println("- " + actual.descripcion);
	        actual = actual.siguiente;
	    }
	}
	
	
	// Ver proxima tarea
	public String proximaTarea() {
		if (estaVacia()) {
	        return "No hay tareas pendientes"; 
	    }
	    return cima.descripcion;
	} 
	
	
	
	// Marcar tareas como completadas
	public void marcarTareaCompletada() {
		if (estaVacia()) {
			System.out.println("\nNo hay tareas pendientes para completar.");
	        return;
		}
		
		String tareaCompletada = cima.descripcion;
		cima = cima.siguiente;
		getColaCompletadas().tareasCompletadas(tareaCompletada);
		System.out.println("\nLa tarea: " + tareaCompletada + " ha sido completada");
	}


	public Cola getColaCompletadas() {
		return colaCompletadas;
	}


	public void setColaCompletadas(Cola colaCompletadas) {
		this.colaCompletadas = colaCompletadas;
	}


	public Nodo getCima() {
		return cima;
	}
}
