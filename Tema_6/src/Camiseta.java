
public class Camiseta extends Ropa {
	
	private String mangas;
	private boolean dibujo;

	public Camiseta ( String color,String fabricante, float precio,	String tejido, String mangas_, boolean dibujo_){
		super(color,fabricante,precio,tejido);
		
		mangas=mangas_;
		dibujo=dibujo_;
	}
	
	public Camiseta (String m, boolean d){
		mangas=m;
		dibujo=d;
	}
	
	public void imprimir(){
		super.imprimir();
		System.out.println("mangas:"+mangas);
		System.out.println("dibujo:"+dibujo);
	}
	
}//FIN
