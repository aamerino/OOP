package estacion;

import java.util.concurrent.ThreadLocalRandom;

import bicicleta.Bicicleta;
import tarjetaUsuario.TarjetaUsuario;

public class Estacion {
	private int id = 0;
	private String direccion = null;
	private int numeroAnclajes = 0;
	private Bicicleta[] anclajes;

	public Estacion(int id, String direccion, int numeroAnclajes) {
		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes = numeroAnclajes;
		this.anclajes = new Bicicleta[numeroAnclajes];
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumeroAnclajes() {
		return numeroAnclajes;
	}

	public void setNumeroAnclajes(int numeroAnclajes) {
		this.numeroAnclajes = numeroAnclajes;
	}

	public Bicicleta[] getAnclajes() {
		return anclajes;
	}

	public void setAnclajes(Bicicleta[] anclajes) {
		this.anclajes = anclajes;
	}

	public void consultarEstacion() {
		System.out.println("id: " + this.getId());
		System.out.println("direccion: " + this.getDireccion());
		System.out.println("numeroAnclajes: " + this.getNumeroAnclajes());

	}

	public int anclajesLibres() {
		int anclajesLibres = 0;
		for (Bicicleta bicicleta : this.anclajes) {
			if (bicicleta == null) {
				anclajesLibres++;
			}
		}
		return anclajesLibres;
	}

	public void anclarBicicleta(Bicicleta bicicleta) {
		int i = 0;
		for (Bicicleta biciArray : this.anclajes) {

			if (biciArray == null) {
				this.anclajes[i] = bicicleta;
				this.mostrarAnclaje(bicicleta, i);
				break;
				// break; has de romper el bucle para que no este método no siga
				// asignando
				// la primera bici a todas las posiciones del array
			} else {
				i++;
			}
			/*
			 * try{ while (anclajes != null){ i++; } if (i !=
			 * this.anclajes.length &&
			 * this.anclajes[this.anclajes.length].getId() == 0){
			 * this.anclajes[i]= bicicleta; this.mostrarAnclaje(bicicleta, i);
			 * }else{ System.out.println("No hay anclajes libres"); }
			 * }catch(ArrayIndexOutOfBoundsException e){
			 * System.out.println("Error");
			 */
		}
	}

	public void consultarAnclajes() {
		for (int i = 0; i < this.getNumeroAnclajes(); i++) {
			// la condición i == this.getNumeroAnclajes no se cumple nunca => el
			// bucle no se ejecuta
			// has de escribir i <= this.getNumeroAnclajes();
			Bicicleta bicicleta = this.getAnclajes()[i];
			System.out.print("Anclaje " + i + " ");
			if (bicicleta != null) {
				System.out.println(bicicleta.getId());
			} else {
				System.out.println("Libre");
			}
		}
	}

	public void mostrarAnclaje(Bicicleta bicicleta, int numeroAnclaje) {
		System.out.print("Bicicleta: " + bicicleta.getId());
		System.out.println(" NumeroAnclaje: " + numeroAnclaje);

	}

	public boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario) {
		return tarjetaUsuario.isActivada();
	}

	public void retirarBicicleta(TarjetaUsuario tarjetaUsuario) {
		// la lógica de este método es correcta
		if (this.leerTarjetaUsuario(tarjetaUsuario)) {
			boolean bicicletaGuardada = false;
			while (bicicletaGuardada != true) {
				int anclaje = ThreadLocalRandom.current().nextInt(0, this.numeroAnclajes);
				if (this.anclajes[anclaje] != null) {
					Bicicleta BicicletaRetirada = this.anclajes[anclaje];
					this.anclajes[anclaje] = null;
					this.mostrarBicicleta(BicicletaRetirada, anclaje);
					bicicletaGuardada = true;
				}
			}
		}

	}

	public void mostrarBicicleta(Bicicleta bicicleta, int numeroAnclaje) {
		System.out.println("bicicleta retirada: " + bicicleta.getId() + " del anclaje: " + (numeroAnclaje + 1));
	}

}
