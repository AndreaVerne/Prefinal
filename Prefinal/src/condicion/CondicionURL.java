package condicion;

import prefinal.Marcador;

public class CondicionURL extends Condicion {

	protected String url;
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
	public CondicionURL(String url) {
		this.url = url;
	}

	
	@Override
	public boolean cumple(Marcador m) {
		return m.getUrl().contains(url);
		
	}

}
