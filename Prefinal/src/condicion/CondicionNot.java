package condicion;

import prefinal.Marcador;

public class CondicionNot extends Condicion {
	protected Condicion c1;

	
	public CondicionNot(Condicion cond1) {
        this.c1 = cond1;
    }
	
	@Override
	public boolean cumple(Marcador m) {
		return !c1.cumple(m) ;
	}

}
