package Listadoble;

public class PruebaListaDoble {
	public static void main(String[] args) {
        // TODO code application logic here
        ListaDoble<Integer> j = new ListaDoble();
        j.agregarAlFinal(100);
        j.agregarAlFinal(50);
        j.agregarAlFinal(5);
        j.agregarAlFinal(56);
        j.agregarAlFinal(80);
        j.transversal();
        System.out.println("----- Primera lista -- se agrego el 100 ,50 ,5 ,56 y 80 al final de la lista -----\n");
        j.agregarAlInicio(12);
        j.transversal();
        System.out.println("----- Segunda lista -- se agrego el numero 12 al inicio de la lista -----\n");
        j.agregarDespuesDe(7,2);
        j.transversal();
        System.out.println("----- Tercera lista -- se agrego el numero 7 en la tercera posicion -----\n");
        j.eliminar(3);
        j.transversal();
        System.out.println("----- Cuarta lista -- se elimino el nodo de la posicion 3 -----\n");
        j.eliminarElPrimero();
        j.transversal();
        System.out.println("----- Quinta lista -- se elimino el primer nodo de la lista -----\n");
        j.eliminarElUltimo();
        j.transversal();
        System.out.println("----- Sexta lista -- se elimino el ultimo nodo de la lista -----\n");
        System.out.println(j.buscar(56));
        j.actualizar(50, 8);
        j.transversal();
        System.out.println("----- Septima lista -- actualiza el 50 por el 8 -----\n");
        j.agregarDespuesDe(8, 3);
        j.transversalFinal();
        System.out.println("----- Ultima lista -- muestra la lista de final a inicio-----\n");
    }

}
