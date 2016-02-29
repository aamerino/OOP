/*
 * 3. Asigna a un Array 30 n¨²meros enteros comprendidos entre 1 y 20. Muestra en consola el contenido del Arrayordenado de menor a mayor. Utilizar el m¨¦todo sort de la clase Arrays.
 */
package ejercicioEstructuras3;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] vector = new int[30];
        Random aleatorio = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextInt(20) + 1;
        }

        Arrays.sort(vector);
        for (int numero : vector) {
            System.out.println(numero);
        }
    }


		
}


