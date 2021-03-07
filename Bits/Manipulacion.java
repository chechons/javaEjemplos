package Bits;

public class Manipulacion {

	public static void main(String[] args) {
		
		int numero = 20;
		System.out.println("Este es el numero en BIN: "+Integer.toBinaryString(numero));
		
		int numeroI = numero << 3; // le inyectamos tres ceros (en bits)
		
		System.out.println("Este es el resultado "+ Integer.toBinaryString(numeroI));
		
		System.out.println(numero);
		System.out.println(numeroI); // mostrará el valor nuevo gracias a los bits agregados
		
		int numeroD = numero >> 3;
		
		System.out.println("Este es el numero D en BIN");
		System.out.println("normal: "+numero);
		System.out.println(">> D: "+numeroD);
		
		int numeroDS = -1 >>> 3; // le pasamos 3 para que ignore el signo
		System.out.println("Desplazamiento sin signo "+numeroDS);
		
		
		
		int numA = 88;
		int numB = 150;
		
		int numAnd = numA & numB;
		System.out.println("AND" +numAnd);
		
		int numOr = numA | numB;
		System.out.println("OR" + numOr);
		
		int numXor = numA ^numB;
		System.out.println("Xor"+numXor);
		
		
		
		int numC = 90;
		int numNot = ~numC;
		System.out.println("Not"+numNot);
		
		
	}
	
}
