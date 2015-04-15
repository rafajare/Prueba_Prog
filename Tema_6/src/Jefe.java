
public class Jefe extends Empleados {

	private float bonificacion;
	
		
	public Jefe (String nombre, int salario, int altaEmpresa, float bonificacion_){
		
		super(nombre,salario,altaEmpresa);
		this.bonificacion=bonificacion_;
		
	}


	public float getbonificacion(){
		return bonificacion;
	}
	
	public void setBonificacion(float bonificacion){
		this.bonificacion=bonificacion;
	}
	
	
	
	public float getSalario(){
		float salarioTotal = super.getSalario() + super.getSalario() *bonificacion;
		return salarioTotal;
	}
	
}
