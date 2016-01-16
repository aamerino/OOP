package hora;

public class Hora  {

	private int horas = 0;
	private int minutos = 0;
	private int segundos = 0;
	
	public Hora(int horas, int minutos, int segundos){
		this.setHoras(horas);
		this.setMinutos(minutos);
		this.setSegundos(segundos);
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public int getSegundos() {
		return segundos;
	}
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	public String getHoraCompleta() {
		String horaCompleta = "[%s, %s, %s]";
		String horaFormateada = String.format(horaCompleta, this.getHoras(), this.getMinutos(), this.getSegundos());
		return horaFormateada;
	}
	
	String getHorasPersonalizado(String formato){
		return String.format(formato, getHoras(), getMinutos(), getSegundos());
	}
	
}
