
public class Becario extends Persona{

	private String nombre;
	private int a�o_alta;
	private int departamento;
	
	public Becario(String n, int a_Alta, int d){
		
		super(n, a_Alta);
		
		this.departamento=d;
		
	}
	public String getNombre(){
		return nombre;

	}
	
	public int getAlta(){
		return a�o_alta;
	}
	
	public int getDepartamento(){
		return departamento;
	}
	
 public void getDatos(){
	 System.out.println("Nombre "+nombre);
	 System.out.println("A�o de alta " +  a�o_alta);
	 System.out.println("Departamento" + departamento);
 }
	
}//FIN
