package ejercicioDni;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dni {
	String numero;
	
	public Dni(){
		this.setNumero(null);
	}
	
	public Dni (String numero){
		this.setNumero(numero);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	public boolean check(){
		Pattern pattern = ClasePattern.getCheckdnicif();
		Matcher matcher = pattern.matcher(this.getNumero());
		return matcher.matches();
		
	}
	}
