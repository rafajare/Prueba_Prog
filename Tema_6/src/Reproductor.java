
public class Reproductor extends Dispositivos{
	
	private String almacenamiento;
	private boolean radio;
	
public Reproductor(int peso, int dimensiones, int precios, String almacenamiento_, boolean radio_){
		
	almacenamiento=almacenamiento_;
	radio=radio_;
	}

public Reproductor(){
	
	Reproductor(0, 0, 0, 0, true);
}

}
