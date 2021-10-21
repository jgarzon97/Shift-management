
package tadCola;

public class TadCola<T> implements Cola<T> {

    private String nombre;
    private NodoCola<T> principio;
    private NodoCola<T> fin;
    
    /**
     * Nodo principio de la Cola nodo fin de la Cola.
     */
    public TadCola() {
        principio = null;
        fin = null;
    }
    
    /**
     * Se asignará nombre a la Cola.
     * @param nombre
     */
    public TadCola(String nombre) {
        this();
        this.nombre = nombre;
    }
    
    /**
     * El método invocará el nombre la Cola.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Método para controlar errores para la Cola que este vacía.
     * @return el nodo principio apunta a null en la Cola
     */
    public boolean colaVacia() {
        return principio == null;
    }
    
    /**
     * Asigna null a los nodos de la Cola.
     */
    public void eliminarCola() {
        principio = null;
        fin = null;
    }
    
    /**
     * @return el método asignará el nodo principio al dato de la Cola.
     * @throws ColaVacia
     */
    public T primero() throws ColaVacia {
        if (colaVacia()) {
            throw new ColaVacia("La cola está vacía");
        }
        return principio.dato;
    }

    /**
     * El método encolar, agregará T datos a la Cola.
     * @param x dato genérico
     */
    public void encolar(T x) {
        NodoCola<T> aux;
        aux = new NodoCola<>(x, null);
        if (principio == null) {
            principio = aux;
            fin = aux;
        } else {
            fin.siguiente = aux;
            fin = aux;
        }
    }
    
    /**
     * Elimina el nodo principio para colocar al nodo siguiente como principio.
     * @return T dato
     * @throws ColaVacia
     */
    public T desencolar() throws ColaVacia {
        T resultado;
        if (colaVacia()) {
            throw new ColaVacia("Desencolar: La cola está vacía");
        }
        resultado = principio.dato;
        principio = principio.siguiente;
        if (principio == null) {
            fin = null;
        }
        return resultado;
    }
    
    /**
     * El método quitará el nodo principio de la Cola.
     * @throws ColaVacia
     */
    public void quitarPrimero() throws ColaVacia {
        if (colaVacia()) {
            throw new ColaVacia("Quitar primero: La cola está vacía");
        }
        principio = principio.siguiente;
        if (principio == null) {
            fin = null;
        }
    }
    
    /**
     * Nombre de la Cola.
     * Número de Elementos de la Cola.
     * Si la Cola tiene datos mostrará el primer elemento y ultimo elemento.
     */
    public void mostrarEstadoCola() {
        System.out.println("Estado de la cola " + this.nombre + ":");
        System.out.println("Número de elementos: " + this.numElemCola());
        if (!colaVacia()) {
            System.out.println("Primer elemento - Clave: " + principio.dato);
            System.out.println("Último elemento - Clave: " + fin.dato);
        }
    }
    
    /**
     * Imprime los datos de la cola.
     */
    public void imprimirCola() {
        NodoCola<T> aux;
        System.out.print("Estado de la cola " + this.nombre + ": ");
        aux = principio;
        while (aux != null) {
            System.out.print(aux.dato + " ");
            aux = aux.siguiente;
        }
        System.out.println();
    }
    
    /**
     * De la Cola auxiliar se enumera los datos de la Cola sin alterar la Cola 
     *  principal.
     * @return enteros
     */
    public int numElemCola() {
        NodoCola<T> aux;
        int resul;
        aux = principio;
        resul = 0;
        while (aux != null) {
            ++resul;
            aux = aux.siguiente;
        }
        return resul;
    }
    
    /**
     * Imprime únicamente caracteres.
     * @return String
     */
    public String ImprimirC() {
        String dato = this.nombre + "\n";
        NodoCola<T> aux = principio;
        while (aux != null) {
            dato += aux.dato + "\n";
            aux = aux.siguiente;
        }
        return dato;
    }

}
