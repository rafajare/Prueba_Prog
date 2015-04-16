
public class camara extends Dispositivos{
	
	private String resolucion;
	private boolean flash;
	
	public camara(int peso, int dimensiones, int precios, String resolucion_, boolean flash_){
		
		resolucion=resolucion_;
		flash=flash_;
	}

	public void getDescuento(){
		System.out.println("Precio Final"+ precios*0.90);
	}
}
