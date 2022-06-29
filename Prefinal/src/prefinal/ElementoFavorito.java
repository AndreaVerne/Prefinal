package prefinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import condicion.Condicion;

public abstract class ElementoFavorito {
	
	//"Solo se restringe la estructura a partir de una palabra clave
	public abstract ElementoFavorito restringir(String palabra);

	public abstract int getCantidad();
	
	public abstract ArrayList<String> listarPalabrasClave();
	
	//Cuento la cantidad de palabras clave sin repetir reutilizndo el metodo
	public int cantidadPalabrasClave() {
		return this.listarPalabrasClave().size();
	}	
	
	//listar
	public abstract ArrayList<Marcador> buscar(Condicion c);
	
	//ordenar
	public ArrayList<Marcador> buscar(Condicion c, Comparator cp){
		ArrayList<Marcador> result = this.buscar(c);
		
		Collections.sort(result, cp);
		
		return result;
		
	}
}
