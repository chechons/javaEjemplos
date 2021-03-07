package Vectores;

import java.util.Vector;

public class Vectores {

	public static void main(String[] args) {
		
		Vector v1 = new Vector();
		Vector v2 = new Vector(10); // segunda forma asignandole un tamaño
		Vector v3 = new Vector(v2); // tercera forma crear uno a partir de otro vector
		
		Vector <String> vector = new Vector<String>();
		
		vector.addElement("Cadena");
		//vector.addElement(2);
		
		vector.addElement("cadena2");
		//vector.addElement(9);
		
		vector.insertElementAt("AJ", 1); // agregar este string en la posicion 1
		
		/* ACCEDER */
		
		System.out.println(vector.get(2));
		System.out.println(vector.size()); // cantidad de elementos
		System.out.println(vector.elementAt(2)); // dos formas diferentes de acceder
 		
		
		/* Eliminar */
		vector.removeElementAt(0);
		vector.removeElement("AJ");
		vector.removeAll(vector);
		
		/* Operaciones */
		System.out.println(vector.contains("AJ"));
		System.out.println(vector.indexOf("AJ"));
		
		
	}
	
}
