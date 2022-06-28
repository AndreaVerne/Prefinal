package condicion;

import prefinal.Marcador;

public class CondicionURL extends Condicion {

	protected String url;
	
	@Override
	public boolean cumple(Marcador m) {
		return m.getUrl().contains(url);
		
	}

}
