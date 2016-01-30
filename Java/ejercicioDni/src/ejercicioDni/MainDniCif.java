package ejercicioDni;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MainDniCif {

	public static void main(String[] args) {
		{
			String[] DniIncorrecto ={"12345678I", "123456B", "54324562A", "98765434O", "23456789U"};
			String[] DniCorrecto ={"78484464T","72376173A","01817200Q","95882054E","63587725Q","26861694V","21616083Q","26868974Y","40135330P","89044648X"};
			String[] NieCorrecto = {"Y5430548D", "Z9175220L", "X1683420G", "Z5703862M", "Z8307497V","Y0260927Y","X9836563S","X6460773G","Y8208972X","Y1007563Q"};
			String[] NieIncorrecto = {"Y54305", "Z9175220A", "X83420G", "W1683420G", "Z8337497V", "Y0260927Y"};
			Map<String, String[]> listaCasos = new TreeMap<String, String[]>()						
			{{
							     put("DniIncorrecto", DniIncorrecto);
							     put("DniCorrecto", DniCorrecto);
							     put("NieCorrecto", NieCorrecto);
							     put("NieIncorrecto", NieIncorrecto);
							}};
			for (Entry<String, String[]> grupoNumeros  : listaCasos.entrySet()){
				System.out.println(grupoNumeros.getKey());
				System.out.println();
				String formatoCasoTest = "Dni/Nie Completo: %s, Parte Numerica: %s,Parte Alfabetica: %s, Letra Valida: %s";
				for (String valorNie: grupoNumeros.getValue()){
					DniCif casoTest = new DniCif(valorNie);
					System.out.println(String.format(formatoCasoTest, casoTest.getDni().getNumero(), casoTest.getParteNumerica(), casoTest.getParteAlfabeticaDni(),casoTest.checkLetraValida()));


				}
			}
			}
					

		}
}



