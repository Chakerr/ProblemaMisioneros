package interfaz;

import gfutria.SearchStateSpaces;
import java.util.ArrayList;
import mundo.Misioneros;

/**
 * Clase main encargada de ejecutar el programa.
 * @version 2.0.
 * @author Mario Palencia
 * @author Kevin Navarrete
 * @author Gabriel Romero
 * @author Daniel Torres
 */
public class InterfazAPP {
    /**
     * Constructor de la clase principal.
     */
    public InterfazAPP() {
    }    
    /**
     * Metodo principal encargado de ejecutar el problema de los 3 canibales.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        SearchStateSpaces ss;
        Misioneros misioneros;
        ArrayList<String> lst;

        System.out.println("Problema de los Misioneros y Canibales...");
        misioneros = new Misioneros(3, 3, 1, 0, 0, 0); // Inicializa con 3 misioneros, 3 caníbales y capacidad del bote

        ss = new SearchStateSpaces("0:0:0=3:3:1", misioneros, 5); // El estado inicial representa los misioneros y caníbales en la orilla izquierda
        lst = ss.solve();

        System.out.println("Numero de pasos: " + lst.size());
        if (!lst.isEmpty()) {
            for (int i = 0; i < lst.size(); i++) {
                System.out.println("paso " + (i + 1) + ": " + lst.get(i));
                imprimirEstado(lst.get(i));
            }
        }

    }

    /**
     * Imprime el estado actual del problema, mostrando la distribución de misioneros y caníbales en ambas orillas.
     * @param estado El estado del problema en formato de cadena.
     */
    private static void imprimirEstado(String estado) {
        String[] partes = estado.split("=");

        String izquierda = partes[0];
        String derecha = partes[1];

        System.out.println("Izquierda: " + izquierda);
        System.out.println("Derecha  : " + derecha);
        System.out.println("---------------");
    }
}
