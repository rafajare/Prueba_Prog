
public class Dispositivos {
	
private int peso;
private int dimensiones;
private int precios;

public void Dispositivos (int peso, int dimensiones, int precios){
	
	this.peso=peso;
	this.dimensiones=dimensiones;
	this.precios=precios;
	
}//FIN

public Dispositivos(){
	
	Dispositivos(0,0,0);
	
}//FIN

public void imprimir(){
	
	System.out.println("Peso =" + peso +"g");
	System.out.println("dimensiones =" + dimensiones+"mm");
	System.out.println("precios =" + precios+"�");
	
}//FIN

}//FIN
