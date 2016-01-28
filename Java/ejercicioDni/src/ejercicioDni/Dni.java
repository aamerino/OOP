package ejercicioDni;

public class Dni {
	private String dni;
	private TablaDeAsignacion tabla = new TablaDeAsignacion();
	final private String ExpressionRegular = "\\d{8}."; 
	
	public Dni (String dni){
		this.setDni(dni); 
		
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getExpressionRegular() {
		return ExpressionRegular;
	}

	public boolean checkNumeroDni(){
		return this.getDni().matches(this.getExpressionRegular());
	}
	
	
}
