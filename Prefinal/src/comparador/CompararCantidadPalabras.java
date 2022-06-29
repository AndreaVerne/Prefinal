package comparador;

import prefinal.Marcador;

public class CompararCantidadPalabras extends CondicionOrden {
	
	@Override
	public int compararMarcadores(Marcador m1, Marcador m2) {
	
		return m1.cantidadPalabrasClave() -  m2.cantidadPalabrasClave();
	}

}
