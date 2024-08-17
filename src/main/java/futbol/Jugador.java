package futbol;

public class Jugador extends Futbolista{
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}

	@Override
	public String toString() {
		return "El futbolista " + getNombre()+  " tiene " +String.valueOf(getEdad())+ ", y juega de "+getPosicion()+
				" con el dorsal " + String.valueOf(dorsal)+". Ha marcado " + golesMarcados;

	}
	
	@Override
	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return false;
	}

	public short getGolesMarcados() {
		return golesMarcados;
	}

	public void setGolesMarcados(short golesMarcados) {
		this.golesMarcados = golesMarcados;
	}

	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}

	@Override
	public int compareTo(Futbolista o) {
		int ed1= 0;
		int ed2 = 0;
		if (getEdad() < 0) {
			ed1 = -getEdad();
		} else {
			ed1 = getEdad();
		}
		
		if (o.getEdad() < 0) {
			ed2 = -o.getEdad();
		} else {
			ed2 = o.getEdad();
		}
		
		return ed1 + ed2;
	}
	
	
}
