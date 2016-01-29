package ejercicioDni;


import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MainDniNie {

	public static void main(String[] args) {
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
			for (String valorNie: grupoNumeros.getValue()){
				DniNie casoTest = new DniNie(valorNie);
				if (casoTest.check()){
					System.out.println(valorNie + " Ok");
				}else{

					System.out.println(valorNie + " Fail");
				};
			}
		}
		}
				

	}


