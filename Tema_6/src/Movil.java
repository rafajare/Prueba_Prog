
public class Movil extends Dispositivos { //ASI CON CAMARA Y REPRODUCTOR

	private int operador;
	private boolean camara;
	
	
	public Movil(int peso, int dimensiones, int precios, int operador_,boolean camara_){
		//super(peso,dimensiones,precios);
		
		operador=operador_;
		camara=camara_;
		
	}
	
	public Movil(){
		this(0, 0, 0, 512, true);
	}

	public void Imprimir(){
		
	}
}


