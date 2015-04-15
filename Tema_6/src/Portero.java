
public class Portero extends Jugador{
	
	private int golesEncajados;
	private int penaltisParados;
	

	//b) Crear un constructor para dar valor a todos los atributos de la clase
	//Portero, incluidos los heredados. Deberá usar el constructor de la clase
	//Jugador
	
	public Portero (String nombre, String demarcacion,int partidosJugados, int golesMarcados, int tarjetasAmarillas, int tarjetasRojas,int golesEncajados_, int penaltisParados_){
		super(nombre,demarcacion,partidosJugados,golesMarcados,tarjetasAmarillas,tarjetasRojas);
		
		golesEncajados=golesEncajados_;
		penaltisParados=penaltisParados_;
		
	}
	
	public Portero(int golesRecibidos, int paradas){
		
		golesEncajados=golesRecibidos;
		penaltisParados=paradas;
	}
	
	public void imprimir(){
		super.imprimir();
		System.out.println("golesEncajados:" +golesEncajados);
		System.out.println("penaltisParados:" +penaltisParados);
	}
	
}//FIN CLASS