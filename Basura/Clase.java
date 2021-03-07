package Basura;

public class Clase {
	public static void main(String[] args) {
		
		Object objeto = new Object();
		// asi se libera la memoria de un objeto
		objeto = null;
		
		Main objeto2 = new Main();
		
		objeto2 = null;
		
		// Runs the garbage collector, libera la memoria que utilizaron los objetos
		System.gc();
		
	}
}
