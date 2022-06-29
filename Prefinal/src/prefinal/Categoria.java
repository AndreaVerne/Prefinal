package prefinal;

import java.util.ArrayList;

import condicion.Condicion;

public class Categoria extends ElementoFavorito {
	String nombre;
	String descripcion;
	ArrayList<ElementoFavorito> elems;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public ArrayList<ElementoFavorito> getElems() {
		ArrayList<ElementoFavorito> aux = new ArrayList<>();
		for (int i = 0; i < elems.size(); i++) {
			aux.add(elems.get(i));
		}
		return aux;
	}

	public void addElems(ElementoFavorito e) {
		if (!elems.contains(e)) {
			elems.add(e);
		}
	}

	public boolean equals(Object o1) {
		Categoria cc = (Categoria) o1; // lo casteo
		return cc.getNombre().equals(cc) && cc.getDescripcion().equals(cc);

	}

	public Categoria(String n, String d) {
		this.nombre = n;
		this.descripcion = d;
		this.elems = new ArrayList<>();
	}

	@Override
	public ElementoFavorito restringir(String palabra) {
		boolean encontro = false;

		Categoria copia = new Categoria(nombre, descripcion);

		for (int i = 0; i < elems.size(); i++) {
			ElementoFavorito e = elems.get(i).restringir(palabra);
			if (e != null) {
				copia.addElems(e);
				encontro = true;
			}
		}
		if (encontro == true) {
			return copia;
		} else {
			return null;
		}
	}

	@Override
	public int getCantidad() {
		int suma = 0;
		for (int i = 0; i < elems.size(); i++) {
			suma += elems.get(i).getCantidad();
		}
		return suma;
	}

	@Override
	public ArrayList<String> listarPalabrasClave() {
		ArrayList<String> result = new ArrayList<>();
		for (int i = 0; i < elems.size(); i++) {
			// para controlar repetidos
			ArrayList<String> pal = elems.get(i).listarPalabrasClave();
			for(int j = 0; j < pal.size() ; j++) {
				if(result.contains(pal.get(j))) {
					result.add(pal.get(i));
				}
			}
		}
		return result;
	}

	@Override
	public ArrayList<Marcador> buscar(Condicion c) {
		ArrayList<Marcador> result = new ArrayList<>();
		for (int i = 0; i < elems.size(); i++) {
			ArrayList<Marcador> m = elems.get(i).buscar(c);
			result.addAll(m);
		}
		return result;
	}

}
