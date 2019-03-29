
public class Empleado extends Prestamista {
	//Attributes
	private static byte MAX_PRESTAMOS = 100;
	private String departamento;
	private String puesto;

	//Methods
	@Override
	public byte maxPrestamos() {
		return MAX_PRESTAMOS;
	}
	
	public String toString() {
		return "";
	}
}
