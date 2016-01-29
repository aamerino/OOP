package ejercicioDni;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DniNie {
	String numero;
	
	public DniNie (String numero){
		this.setNumero(numero);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	public boolean check(){
		Pattern pattern = Pattern.compile("(([X-Z]{1})(\\d{7})([A-Z&&[^IOU]]{1}))|((\\d{8})([A-Z&&[^IOU]]{1}))");
		Matcher matcher = pattern.matcher(this.getNumero());
		return matcher.matches();
		
	}
	}
