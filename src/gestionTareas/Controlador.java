package gestionTareas;

public class Controlador {
	
	private Modelo modelo;
	private Vista vista;
	
	public Controlador(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
	}
	
	
	// Controlador entre la interaccion Vista y Modelo
	public void iniciar() {
		boolean continuar = true;
		
		while (continuar) {
			vista.mostrarMenu();
			int opcion = vista.leerOpcion();
			
			switch (opcion) {
			case 1:
				String descripcion = vista.leerDescripcionTarea();
				modelo.agregarTarea(descripcion);
				vista.mostrarMensaje("Tarea agregada correctamente\n");
				break;
				
			case 2: 
				modelo.marcarTareaCompletada();
				vista.mostrarConfirmacionTarea(modelo.proximaTarea());
				break;
				
			case 3:
				String tareaEliminada = modelo.eliminarTarea();
				vista.mostrarMensaje(tareaEliminada);
				break;
				
			case 4:
				vista.mostrarTareasPendientes(modelo.verTareasPendientes());
				break;
				
			case 5:
				String proximaTarea = modelo.proximaTarea();
				vista.mostrarMensaje("\nProxima tarea: " + proximaTarea);
				break;
				
			case 6: 
				continuar = false;
				break;
				
			default:
				vista.mostrarMensaje("\nOpcion no valida");
				break;
				}
		}
		
	}
	
}
