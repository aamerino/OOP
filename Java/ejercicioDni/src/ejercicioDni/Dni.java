package ejercicioDni;

public class Dni {
	private String dni;
	private TablaDeAsignacion tabla = new TablaDeAsignacion();
	final private String ExpressionRegularNumero = "\\d{8}."; 
	
	public Dni (String dni){
		this.setDni(dni); 
		
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getExpressionRegularNumero() {
		return ExpressionRegularNumero;
	}

	public boolean checkNumeroDni(){
		return this.getDni().matches(this.getExpressionRegularNumero());
	}
	
	
}
