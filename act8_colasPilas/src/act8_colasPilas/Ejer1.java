package act8_colasPilas;

import java.util.LinkedList;
import java.util.Queue;

public class Ejer1 {
	static Queue<Integer> cola= new LinkedList<>(); 

	
	
	public static void Ejecutar() {
		int i =1;
		while( i<6) {
			cola.add(i);
			i++;
		}
			
	}
	
	public static void funcionR() {
		
		if(cola.isEmpty()) {
			
		}
		int numero =cola.poll();
		
		
	}

	
	
}
