package ejercicioDni;

import java.util.regex.Pattern;

public class ClasePattern {
	final private static Pattern getNumerosDni = Pattern.compile("\\d{8}") ;
	final private static Pattern getNumerosNif = Pattern.compile("([X-Z]{1})(\\d{7})") ;
	final private static Pattern getLetraDni = Pattern.compile("[A-Z&&[^IOU]]{1}");
	final private static Pattern checkDniCif = Pattern.compile("(([X-Z]{1})(\\d{7})([A-Z&&[^IOU]]{1}))|((\\d{8})([A-Z&&[^IOU]]{1}))");	
	
	
	public static Pattern getNumerosDni() {
		return getNumerosDni;
	}

	public static Pattern getGetletradni() {
		return getLetraDni;
	}

	public static Pattern getCheckdnicif() {
		return checkDniCif;
	}

	public static Pattern getNumerosNif() {
		return getNumerosNif;
	}
	
}
