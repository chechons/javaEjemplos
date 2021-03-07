package PAvanzada;

public class Ejemplo {

	public static void main(String[] args) {
		
		int[][] arrayInts = {
				{10,90,92,45}, // fila 0
				{77,20,9,12}, // fila 1
				{40,32,11,49} // fila 2
		};
		
		int i,j = 0;
		int buscando = 49;
		boolean encontrado = false;
		
		// etiquetas que no sean palabras reservados
		buscar:
			
			for(i=0;i<arrayInts[i].length;i++) {
				for(j=0;j<arrayInts[i].length;j++) {
					if(arrayInts[i][j]==buscando) {
						encontrado = true;
						break buscar;
					}
				}
			}
		
		if(encontrado) {
			System.out.println("Encontrado "+buscando+" en "+i+" , "+ j );
		}else {
			System.out.println("No encontramos "+buscando);
		}
		
		
		
	}
	
	
}
