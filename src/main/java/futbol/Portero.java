package futbol;

public class Portero extends Futbolista{
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre,edad,"Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}

	@Override
	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public String toString() {
		return "El futbolista " + getNombre() + " tiene " + getEdad() + 
				", y juega de " + getPosicion() + " con el dorsal " + dorsal+
				". Le han marcado " + golesRecibidos;
	}

	@Override
	public int compareTo(Object o) {
		int ed1= 0;
		int ed2 = 0;
		Portero a = (Portero)o;
		if (golesRecibidos < 0) {
			ed1 = -golesRecibidos;
		} else {
			ed1 = golesRecibidos;
		}
		
		if (a.golesRecibidos < 0) {
			ed2 = -a.golesRecibidos;
		} else {
			ed2 = a.golesRecibidos;
		}
		
		return ed1 + ed2;
	}
}
