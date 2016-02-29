/*
 * Declara un Array de nombre lista que estar芍 formado por 25 datos de tipo entero generados al azar comprendidos entre 25 y 50.
Declara otro vector de nombre auxiliar formado por 4 datos de tipo real. Almacenar en este Array lo siguiente: 
Posici車n 0: n迆mero de n迆meros pares en lista. 
Posici車n 1: n迆mero de n迆meros impares de lista. 
Posici車n 2: media de los n迆meros impares de lista. 
Posici車n 3: suma de los n迆meros enteros comprendidos entre 1 y el valor par m芍s pequeno de lista. 
Escribe a continuaci車n el contenido de lista, as赤 como los resultados obtenidos y almacenados en auxiliar.
 */
package ejercicioEstructurasDatos2;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] lista = new int[25];
        Random aleatorio = new Random();
        double[] auxiliar = new double[4];
        int sumaImpares = 0;
        int numeroMenor = 0;
        for (int i = 0; i < lista.length; i++) {
            lista[i] = aleatorio.nextInt(26) + 25;
        }
        
        numeroMenor = lista[0];
        for(int numero: lista){
        	//Numero Par
        	if (numero % 2 == 0){
        		auxiliar[0]++;
        	}else{
        	//Numero Impar
        		auxiliar[1]++;
        	//Suma Impares
        		sumaImpares += numero;
        	}
        	//Numero menor.
        	if (numero < numeroMenor){
        		numeroMenor = numero;
        	}else{
        	}
        	
        }
        //Suma enteros
        for (int i = 1; i <= numeroMenor; i++) {
            auxiliar[3] += i;
        }
        auxiliar[2]= sumaImpares/ auxiliar[1];
        
     
        
		System.out.println("Numeros Pares : "+auxiliar[0]);
		System.out.println("Numeros Inpares : "+auxiliar[1]);
		System.out.println("Media Impares  : "+auxiliar[2]);
		System.out.println("Suma enteros del Menor " + auxiliar[3]);

		
	}

		
}
