package ejercicioDni;

import java.util.regex.Matcher;

public class DniCif {
	
		private Dni dni  = new Dni();
		// Composici¨®n (agregaci¨®n) "Has - a" / "Tiene - un"
		private TablaDeAsignacion tabla = new TablaDeAsignacion();

		/* Constructores */
		
		public DniCif(String dni) {
			this.setDni(dni);
		}
		
		/* Encapsulacion */
		
		public void setDni(String cadena){
			this.dni.setNumero(cadena);
		}

		public Dni getDni(){
			return this.dni;
		}
	
		public TablaDeAsignacion getTabla() {
			return tabla;
		}

		public void setTabla(TablaDeAsignacion tabla) {
			this.tabla = tabla;
		}
	
		/* Interfaz P¨²blica */
		


		

		
		//Necesita refactorizacion, solo sirve para 2 casos....
		public String getParteNumerica() {
			//try{
				//if (!this.getDni().check()){
					//return "0"; 
				//}
				if (this.isDni()){
					Matcher matcher = ClasePattern.getNumerosDni().matcher(this.getDni().getNumero());
					matcher.find();
					return matcher.group(0);
				}else if(this.isNif()){
					Matcher matchernif = ClasePattern.getNumerosDni().matcher(this.convertirNif());
					matchernif.find();
					return matchernif.group(0);
					
				}
				
			//}catch(Exception e){
				//return "0";
			
			//wtf????
			return "0";
		
			}
	
		public String getParteAlfabeticaDni() {
				
				Matcher matcher = ClasePattern.getGetletradni().matcher(this.getDni().getNumero());
				if (matcher.find()){
					return this.getDni().getNumero().substring(this.getDni().getNumero().length() - 1); 
				}
				return "TILT";
		}
		

		
		public char obtenerLetra(){
	
				return this.tabla.calcularLetra( this.getParteNumerica() );
			}
		
		public Boolean checkLetraValida() {
	
			return this.getParteAlfabeticaDni().charAt(0) == (this.obtenerLetra());

		}
		public String convertirNif(){
			String numeroNif = this.getDni().getNumero();
			return numeroNif.replace(this.getPrimeraLetraNif(), this.getTabla().getNumeroLetraNif(this.getPrimeraLetraNif()));

		}
		
		public char getPrimeraLetraNif(){
			if (this.isNif()){
				return this.getDni().getNumero().substring(0, 1).charAt(0);
			}else{
				return 'I';
			}
		}
		public Boolean isDni(){
			Matcher matcher = ClasePattern.getNumerosDni().matcher(this.getDni().getNumero());
			return matcher.find();
		}
		
		public Boolean isNif(){
			Matcher matchernif = ClasePattern.getIsNif().matcher(this.getDni().getNumero());
			return matchernif.find();
		}
		}
