package Listadoble;

public class ListaDoble<T> {
    NodoDoble<T> head;
    int Tamanio;
    NodoDoble<T> cola;

    public ListaDoble() {
        this.head = null;
        this.Tamanio = 0;
        this.cola = null;
    }
    // Metodo cuando la lista esta vacia 
    public boolean estaVacia() {
        return this.head == null;
    }

    public int getTamanio() {
        NodoDoble aux=this.head;
        while(aux!= null){
            aux.getSiguiente();
            Tamanio +=1 ;
        }
        return Tamanio;
    }
    // metodo para agregar al inicio  
    public void agregarAlInicio(T valor) {
        NodoDoble nuevo = new NodoDoble(valor);
        if (this.estaVacia()) {
            this.head = nuevo;
        } else {
            nuevo.setSiguiente(this.head);
            this.head.setAnterior(nuevo);
            this.head = nuevo;
        }
    }
    // metodo para agregar al final
    public void agregarAlFinal(T valor) {
        NodoDoble nuevo = new NodoDoble(valor);
        if (this.estaVacia()) {
            this.head = nuevo;
            this.cola = nuevo;
        } else {
            NodoDoble aux = this.head;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
            this.cola= aux;
        }
    }
    // metodo para agregar un nodo despues del nodo de referencia
    public void agregarDespuesDe(T valor, int posicion){
        NodoDoble nuevo = new NodoDoble(valor);
        NodoDoble aux = this.head;
        for (int contador = 1; contador <= posicion - 1; contador++){
            aux = aux.getSiguiente();
        }
        nuevo.setSiguiente(aux.getSiguiente());
        nuevo.setAnterior(aux);
        aux.setSiguiente(nuevo);
    }
    // metodo para eliminar el primer nodo 
    public void eliminarElPrimero(){
        NodoDoble aux = this.head;
        if (!this.estaVacia()){
            this.head = aux.getSiguiente();
            this.head.setAnterior(null);
        }
    }
    // metodo para eliminar el nodo del final 
    public void eliminarElUltimo(){
        if (!this.estaVacia()) {
            NodoDoble aux = this.head;
            while (aux.getSiguiente().getSiguiente() != null){
                aux = aux.getSiguiente();
                this.cola=aux;
                
            }
            aux.setSiguiente(null);
        } else {
            head = null;
        }
    }   
    // metodod para eliminar un elemento en cierta posicion
    public void eliminar(int posicion){
        NodoDoble aux1 = this.head;
        NodoDoble aux2 = null;
        for (int contador = 1; contador < posicion - 1; contador++){
            aux1 = aux1.getSiguiente();
        }
        aux2= aux1.getSiguiente().getSiguiente();
        aux1.setSiguiente(aux2);
        aux2.setAnterior(aux1);
    }
    // metodo para buscar un elemento de la lista y regresar su posicion
    public int buscar(T valor){
        int j=1;
        NodoDoble aux = this.head;
        while(aux != null && aux.getDato()!= valor ){
            aux = aux.getSiguiente();
            j +=1;
        }
        return j;
    }
    // metodo para actualizar un elemento
    public void actualizar(T a_buscar,T dato ){
        NodoDoble aux = this.head;
        if(!this.estaVacia()){
            while(aux != null && aux.getDato()!=a_buscar){
                aux = aux.getSiguiente();
            }
            aux.setDato(dato);
        }
    }
    // metodo para mostrar los elementos de izquierda a derecha 
    public void transversal() {
        NodoDoble curr_node = this.head;
        while (curr_node != null) {
            System.out.print(curr_node);
            curr_node = curr_node.getSiguiente();
        }
        System.out.println("");
    }
    // metodo para mostrar los elementos de derecha a izquierda
    public void transversalFinal(){
        NodoDoble curr_node = this.cola;
        while(curr_node != null){
            System.out.print(curr_node);
            curr_node = curr_node.getAnterior();
        }
        System.out.println("");
    }
}
