package OpTernario;

public class Main {

	public static void main(String[] args) {
		int numero = 21;
		String cadena;
		
		if(numero<20) {
			cadena = "menos";
		}else {
			cadena = "mas";
		}
		
		System.out.println(cadena);
		
		// operador ternario ?:
		String cadena2 = numero<20 ? "menos": "mas";
		
		System.out.println(cadena2);
		
		
	}
	
}
