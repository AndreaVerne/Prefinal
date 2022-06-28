package prefinal;

import java.util.ArrayList;

public class Marcador extends ElementoFavorito{
	String titulo;
	String url;
	String usuario;
	ArrayList<String> palabras;
	
	public void setTitulo(String t) {
		this.titulo=t;
	}
	
	public String getTitulo() {
		return this.titulo;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public ArrayList<String> getPalabras() {
		ArrayList<String> aux = new ArrayList<String>();
		for (int i = 0; i < palabras.size(); i++) {
			aux.add(palabras.get(i));
		}
		return aux;
	}

	public void setPalabras(String s) {
		if(!palabras.contains(s)) {
			palabras.add(s);
		}
	}

	public Marcador(String titulo, String url, String usuario) {
		this.titulo = titulo;
		this.url = url;
		this.usuario = usuario;
		this.palabras = new ArrayList<>();
	}
	
	

	
}
