import java.util.Date;


public class Empleados extends Persona{
	
	
	private float salario;
	private static final int INICIO_EMPRESA =1995;

	public Empleados(String nombre,int salario_,int año_Alta){
	
		super(nombre, año_Alta);
		this.salario=salario_;
		
		
	}//Constructor
	
	
	
	public float getSalario(){
		return salario;
	}
	
	

	public void setSalario(){
		this.salario=salario;
	}
	
	
	
}
