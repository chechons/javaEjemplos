package Ambitos;

public class Ambitos {
	
	// Ambito de clase - Global
	
	int numeroM;
	String nombre;
	boolean boleano;
	
	public void metodo() {
		
	}
	
	public void metodo2() {
		
	}
	
	// Ambito de metodo, las variables pertenecen solo a ese ambito
	int sumar() {
		int dato = 0;
		return dato;
	}
	
	public void metodo3() {
		 
		// Ambito de bloque
		for(int i = 0;i<10;i++) {
			 int h = 20;
		 }
		 
		// h = 90 no se puede ejecutar ya que esta la variable pertenece al bloque for
	}
	
}
