package condicion;

import prefinal.Marcador;

public class CondicionPalabra extends Condicion {
	protected String palabra;
	
	@Override
	public boolean cumple(Marcador m) {
	
		return m.contiene(palabra);
	}

}
