package mx.unam.fi.mpoo;

import controlador.Sumadora; 
/**
 * Clase principal
 * @author David Gomez
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Clase empaquetada");
        // Instanciar la sumadora
        Sumadora sumadora = new Sumadora();
        double suma = sumadora.sumar(3, 4); 
        System.out.println(suma);

    }
    
}