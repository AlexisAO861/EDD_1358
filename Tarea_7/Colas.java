
/**
 *
 * @author AlexisAO
 * 
 */
package Tareasiete;

import java.util.ArrayList;

public class Colas<T> {
	
	ArrayList<T> datos;
	int longitud;
	int index = 0;
	
	public Colas() {
		// TODO Auto-generated constructor stub
		datos = new ArrayList();
	}

	public boolean isEmpty() {
		return false;
	}

	public int getLongitud() {
		return longitud;
	}
	
	public void enqueue(T elemento) {
		this.datos.add(elemento);
		longitud++;
	}
	
	public T dequeue() {
		return this.datos.remove(index);
	}

	@Override
	public String toString() {
		
		String res = "";
		for (T dato : datos) {
			res += "| " + dato + " |\n";
		}
		return res;
	}
}
