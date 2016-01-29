package ejercicioDni;

public class DniCif {
	
		private String dni  = null;
		// Composici車n (agregaci車n) "Has - a" / "Tiene - un"
		private TablaDeAsignacion tabla = new TablaDeAsignacion();

		/* Constructores */
		
		public DniCif(String dni) {
			this.setDni(dni);
		}
		
		/* Encapsulacion */
		
		public void setDni(String cadena){
			this.dni = cadena;
		}

		public String getDni(){
			return this.dni;
		}
	
		
		/*
		 * L車gica 
		 */
	
		/* Interfaz P迆blica */
		
		public Boolean checkCIF(){
			return this.checkDni() && this.checkLetra();
		}
		
		public Boolean checkDni(){
			return ( checkLongitud() && stringEsNumero( getParteNumericaDni() ) );
		}
		
		public Boolean checkLetra(){
			if (getNumeroSano() ) {
				setLetraSana ( Character.isUpperCase(getParteAlfabeticaDni()) && checkLetraValida() );
				return getLetraSana();
			}
			else {
				return false;
			}
		}
						
		public Character obtenerLetra(){
			// calcularLetra no puede ejecutarse si antes no se cumplen las condiciones previas en checkDni
			// y checkletra
			if ( getNumeroSano() ){
				return this.tabla.calcularLetra( getParteNumericaDni() );
			}
			else // EXCEPCION: aun no sabemos implementarlas - este c車digo no es admisible
				return getParteAlfabeticaDni();
		}
	
	
		public Boolean checkLongitud() {
			return getDni().length() == 9;
		}
		
		public boolean stringEsNumero(){
			for( int i=0; i < cadena.length(); i++ ){
				if ( ! Character.isDigit(cadena.charAt(i)) ){
					return false;
				}
				else;
			}
			return true;
		}		
			
		public String getParteNumericaDni() {
			return (String) dni.substring(0, dni.length() - 1);
		}
		
		public char getParteAlfabeticaDni() {
			return dni.charAt(dni.length() - 1);
		}
		
		public Boolean checkLetraValida() {
			if ( getNumeroSano() ) {
				return getParteAlfabeticaDni() == obtenerLetra();
			}
			else
				return false;
		}

}