package Anid;

public class Main {

	public static void main(String[] args) {
		
		Lampara lampara = new Lampara();
		
		// lampara.encendido;
		
		// si quiero acceder a una anidada hay que llamar a la clase principal
		Lampara.Foco foco = lampara.new Foco(10);
		
		
	}
	
}
