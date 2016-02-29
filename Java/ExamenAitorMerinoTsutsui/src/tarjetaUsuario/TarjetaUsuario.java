package tarjetaUsuario;

public class TarjetaUsuario {
	private int id = 0;
	private boolean activada = false;

	public TarjetaUsuario(int id, boolean activada) { // id es un String
		this.id = id;
		this.activada = activada;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isActivada() {
		return activada;
	}

	public void setActivada(boolean activada) {
		this.activada = activada;
	}

}
