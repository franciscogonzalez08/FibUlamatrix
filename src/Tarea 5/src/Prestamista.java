import java.time.LocalDate;

public abstract class Prestamista {
	//Attributes
	private String nombre;
	private String apellido;
	private int expediente;
	private LocalDate nacimiento;
	private Material[] lista_prestamos = new Material[this.maxPrestamos()];
	private byte reg_prestamos;
	
	//Methods
	public String toString() {
		return "";
	}
	
	public abstract byte maxPrestamos();
	
	public void prestar(Material m) {
		if(m == null)
			return;
		//Check if we have the item
		if(m.)
		
	}
	
	public void devolver(Material m) {
	}
}
