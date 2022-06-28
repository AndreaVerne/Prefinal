package prefinal;

import java.util.ArrayList;

import condicion.Condicion;

public class Categoria extends ElementoFavorito{
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
	public void setElems(ElementoFavorito e) {
		if(!elems.contains(e)) {
			elems.add(e);
		}
	}
	
	public Categoria(String n, String d) {
		this.nombre = n;
		this.descripcion = d;
		this.elems = new ArrayList<>();
	}
	@Override
	public ArrayList<Marcador> buscar(Condicion c) {
		ArrayList<Marcador> result = new ArrayList<>();
		for (int i = 0; i < elems.size(); i++) {
			if(c.cumple(elems.get(i).buscar(c))) {
				result.add(elems.get(i));
			}
		}
		return result;
	}
	
	
}
