package Entidades;

import java.text.DecimalFormat;

import tadCola.Cola;
import tadCola.TadCola;

public class algoritmos {

    public static Cola<String> colaprioridad = new TadCola<>("Cola con Prioridad por Atender");
    public static Cola<String> colanormal = new TadCola<>("Cola Normal por Atender");
    public static Cola<String> colaatendidos = new TadCola<>("Cola de Turnos Atendidos");
    public static Cola<String> caja1 = new TadCola<>("Caja 1");
    public static Cola<String> caja2 = new TadCola<>("Caja 2");
    public static Cola<String> caja3 = new TadCola<>("Caja 3");

    static DecimalFormat df = new DecimalFormat("#.00");
    
    /**
     * Método para calcular aleatoriamente el tiempo promedio.
     * @param <T>
     * @param cola
     * @return tiempo y tiempo promedio 
     */
    public static <T> String tiempoCaja(Cola<String> cola) {
        double tiempo = 0;
        double prom = 0;
        for (int i = 0; i < cola.numElemCola(); i++) {
            tiempo += tiempoaleatorio();
        }
        prom = tiempo / cola.numElemCola();

        return tiempo + " minutos" + "  -------------  "
                + df.format(prom) + " minutos";
    }
    
    /**
     * Método para obtener letras "MAYUS" de forma aleatoria.
     * @return letras
     */
    public static char letraAleatoria() {
        char letra;
        letra = (char) (Math.random() * 26 + 'A');
        return letra;
    }
    
    /**
     * Método para números aleatorios.
     * @return enteros
     */
    public static int numeroaleatorio() {
        int num;
        num = (int) (1000 * Math.random());
        return num;
    }
    
    /**
     * Método para asignar turno utilizando los métodos de letraAleatoria y 
     *  numeroaleatorio.
     * @return letras - numeros
     */
    public static String Turno() {
        String turno = "";
        turno = (letraAleatoria() + "-" + numeroaleatorio());
        return turno;
    }
    
    /**
     * Método para ir contando los turno de la Cola colanormal.
     * @param <T>
     * @param colanormal
     * @return cantidad 
     */
    public static <T> String cola(Cola<String> colanormal) {
        int cant = 0;
        cant = colanormal.numElemCola();
        return " " + cant;
    }
    
    /**
     * Método para mostrar tiempo de forma aleatoria.
     * @return tiempo aleatorio
     */
    public static int tiempoaleatorio() {
        int tiempo = 0;
        tiempo = (int) (Math.random() * 10 + 1);
        return tiempo;
    }
    
    /**
     * Método para mostrar la cantidad de tiempo de forma aleatoria en la Cola.
     * @param <T>
     * @param cola
     * @return tiempo de las cajas
     */
    public static <T> int tiempos(TadCola<T> cola) {
        int tiempo = 0;
        for (int i = 0; i < cola.numElemCola(); i++) {
            tiempo += tiempoaleatorio();
        }
        return tiempo;
    }
    
    /**
     * Método para mostrar la cantidad de Elementos que tiene todas las Colas.
     * @param <T>
     * @param cola
     * @return cantidad de los elementos en la Cola
     */
    public static <T> String Elementos(TadCola<T> cola) {
        int numero = 0;
        numero = cola.numElemCola();
        return numero + "";
    }

}
