package condicion;

import prefinal.Marcador;

public class CondicionUsuario extends Condicion {
	protected String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public CondicionUsuario(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean cumple(Marcador m) {
		
		return m.getUsuario().equals(nombre);
	}

}
