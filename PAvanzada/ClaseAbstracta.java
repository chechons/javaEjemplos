package PAvanzada;

public abstract class ClaseAbstracta {
	/* Las clases abstractas no se pueden instancear - No sirven para crear objetos - Suelen ser clases padres */
	
	int numero;
	
	
	public ClaseAbstracta() {
		
	}
	
	public void metodo() {
		
	}
	
	// tiene que llevar metodo sin codigo
	// debe tener al menos uno para ser una clase abstracta
	// si tiene un metodo abstract la clase tambien debe transformarse en abstract
	public abstract void correr();
	
	
}
