package condicion;

import prefinal.Marcador;

public class CondicionUsuario extends Condicion {
	protected String nombre;
	
	@Override
	public boolean cumple(Marcador m) {
		
		return m.getTitulo().contains(nombre);
	}

}
