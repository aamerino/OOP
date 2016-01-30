package ejercicioDni;

import java.util.Arrays;

public class TablaDeAsignacion {

		final char[] tabla = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' }; 

		final char[] tablaNif = {'X', 'Y', 'Z'};
		
		public char getLetra(int posicion){
	
			try{
				return this.tabla[posicion];
			}
			catch(Exception parameterName){
				return 'I';
			}
		}
		
		
		public char[] getTablaNif() {
			return tablaNif;
		}


		public int getModulo(){
			return this.tabla.length;
		}
		
		public int getNumeroLetraNif(char letra){
			return Arrays.asList(this.getTablaNif()).indexOf(letra);

		}
		
		public boolean letraPermitida(char letra){
			String expressionRegular = "[";
			for (int i = 0; i < this.tabla.length; i ++){
				expressionRegular += (this.tabla[i]);
			}
			expressionRegular += "]";
			
			return String.valueOf(letra).matches(expressionRegular);
		}
		
		public char calcularLetra(String DNI){
			// Obtener el numero del dni del string => dni sano
			// Dividirlo por el número de letras (actualmente 23) y obtener el resto (división módulo)
			// Consultar TablaAsignacion con ese resto = posicion
			int dni = Integer.parseInt(DNI);
			int posicion = dni % getModulo();
			return getLetra(posicion);
		}
		
		public void mostrarTabla(){
			System.out.println(this.tabla); 
		}
		
	}