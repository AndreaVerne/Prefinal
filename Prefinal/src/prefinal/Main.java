package prefinal;

public abstract class Main {
	
	public static void main(String[] args) {
		Marcador youtube = new Marcador("Youtube","www.youtube.com","Andi");
		Marcador google = new Marcador("Google","www.google.com","Andi");
		
		youtube.setPalabras("video");
		google.setPalabras("busqueda");
	
		Categoria utiles = new Categoria("Utilidades", "paginas utiles");
		
		utiles.addElems(youtube);
		utiles.addElems(google);
		
		Marcador makeup = new Marcador("Makeup","www.makeup.com","Andi");
		Marcador ropa = new Marcador("Ropa","www.ropa.com","Andi");
		
		makeup.setPalabras("videos de maquillaje");
		ropa.setPalabras("videos de ropa");
		
		Categoria belleza = new Categoria("Belleza", "paginas beauty");
		
		belleza.addElems(makeup);
		belleza.addElems(ropa);
		
		System.out.println(utiles.listarPalabrasClave());

		/*
		utiles.addElems(belleza);
		System.out.println(utiles.listarPalabrasClave());
*/
		
	}
	
}
