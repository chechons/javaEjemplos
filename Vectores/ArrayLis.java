package Vectores;

import java.util.ArrayList;

public class ArrayLis {

	public static void main(String[] args) {
		
		//ArrayList();
		//ArrayList(int capacidad);
		//ArrayList(Collecction c);
		
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("A");
		array.add("D");
		array.add("H");
		array.add("L");
		array.add("M");
		array.add("M");
		array.add("Q");
		
		array.remove("D");
		
		array.set(0, "Z");
		
		System.out.println(array.indexOf("Z"));
		
	}
	
}
