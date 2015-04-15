
public class PruebaEmpleados {
	
	public static void main(String args []){
		Empleados e1=new Empleados("Rafa",1000, 2001);
		System.out.println("Empleado:" + e1.getNombre());
		System.out.println("Salario:"+ e1.getSalario());
		
		Jefe j1= new Jefe("Jesus",1200, 1999, 0.5f);
		System.out.println("Jefe:"+ j1.getNombre());
		System.out.println("Salario:"+ j1.getSalario());
	
		
	}

}
