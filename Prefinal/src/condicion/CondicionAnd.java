package condicion;

import prefinal.Marcador;

public class CondicionAnd extends Condicion {
	protected Condicion c1;
	protected Condicion c2;
	
	public CondicionAnd(Condicion cond1, Condicion cond2) {
        this.c1 = cond1;
        this.c2 = cond2;
    }
	
	@Override
	public boolean cumple(Marcador m) {
		return c1.cumple(m) && c2.cumple(m);
	}

}
