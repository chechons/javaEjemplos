package ConvImplicitaExplicita;

public class Clase {

	public static void main(String[] args) {
		
		
		// Conversión implicita
		int numero = 10;
		float numerof = 10.1f;
		numerof = numerof + numero;
		
		// Conversión Explicita
		float numeroF = 100.100009f;
		int numeroA = (int) numeroF; // castear el valor
		System.out.println(numeroA);
		
		
	}
	
}
