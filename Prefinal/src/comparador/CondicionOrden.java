package comparador;

import java.util.ArrayList;
import java.util.Comparator;

import prefinal.Marcador;

public abstract class CondicionOrden implements Comparator {

	CondicionOrden siguiente;
	
	public abstract int compararMarcadores(Marcador m1, Marcador m2);
	
	@Override
	public int compare(Object o1, Object o2) {
		int aux = this.compararMarcadores((Marcador)o1,(Marcador)o2);
		
		if((aux == 0) && siguiente != null) {
			return siguiente.compare(o1,o2);
		}else {
			return aux;
		}
	}
	
	
}
