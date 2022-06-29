package comparador;

import prefinal.Marcador;

public class CompararUrl extends CondicionOrden {

	@Override
	public int compararMarcadores(Marcador m1, Marcador m2) {
		return m1.getUrl().compareTo(m2.getUrl());
	}

}
