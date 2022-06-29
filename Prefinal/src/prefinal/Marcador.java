package prefinal;

import java.util.ArrayList;
import java.util.Comparator;

import condicion.Condicion;

public class Marcador extends ElementoFavorito {
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
	
	
//es como una copia
	@Override
	public ElementoFavorito restringir(String palabra) {
		if(this.getPalabras().contains(palabra)) {
			Marcador copia = new Marcador(titulo, url, usuario);
			for (int i = 0; i < palabras.size(); i++) {
				copia.setPalabras(palabras.get(i));
			}
			return copia;
		}
		return null;
	}

	@Override
	public int getCantidad() {
		return 1;
	}

	@Override
	public ArrayList<String> listarPalabrasClave() {
		//como lo hizo el profesor
		return new ArrayList<String>(palabras);		
		
		//ver si esta bien
		//return this.getPalabras();
		
	}

	@Override
	public ArrayList<Marcador> buscar(Condicion c) {
		ArrayList<Marcador> aux = new ArrayList<Marcador>();
		if(c.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}

	public boolean contiene(String palabra) {
		return palabras.contains(palabra);
	}



	
	

	
}
