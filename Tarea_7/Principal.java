package Tareasiete;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colas<Integer> cola = new Colas();
		
		cola.enqueue(10);
		cola.enqueue(20);
		cola.enqueue(30);
		cola.enqueue(40);
		cola.enqueue(50);
		System.out.println(cola);
		cola.dequeue();
		System.out.println(cola);
	}

}
