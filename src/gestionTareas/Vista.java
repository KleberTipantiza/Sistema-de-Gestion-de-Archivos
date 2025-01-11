package gestionTareas;

import java.util.Scanner;

public class Vista {

	private Scanner scanner;
	
	public Vista() {
		this.scanner = new Scanner(System.in);
	}
	
	public void mostrarMenu() {
		System.out.println("\n---Gestion de Tareas---\n");
		System.out.println("1. Agregar tarea");
		System.out.println("2. Marcar tarea como completada");
		System.out.println("3. Eliminar tarea");
		System.out.println("4. Ver tareas pendientes");
		System.out.println("5. Ver proxima tarea");
		System.out.println("6. Salir");
		System.out.println("Elige una opcion");
	}
	
	
	// Leer la opcion del menu 
	public int leerOpcion() {
		return scanner.nextInt();
	}
	
	
	// Leer la descripcion de la tarea 
	public String leerDescripcionTarea() {
		scanner.nextLine();
		System.out.println("\nIntroduce una tarea nueva");
		return scanner.nextLine();
	}
	
	
	// Mostrar mensaje de exito
	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
	
	// Mostrar tareas pendientes
	public void mostrarTareasPendientes(String tareas) {
		System.out.println("\nTareas pendientes:" );
		System.out.println(tareas);
	}
	
	
	// Mostrar tareas completadas 
	public void mostrarTareasCompletadas(String tareasCompletadas) {
		System.out.println("\nTareas completadas:");
		System.out.println(tareasCompletadas);
	}
	
	
	// Mensaje de confirmacion de tarea
	public void mostrarConfirmacionTarea(String tarea) {
	}
	
}
