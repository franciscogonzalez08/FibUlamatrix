import java.time.LocalDate;

public class Profesor extends Prestamista {
	//Attributes
	private static byte MAX_PRESTAMOS = 50;
	private String departamento;
	private String grado;

	//Methods
	@Override
	public byte maxPrestamos() {
		return MAX_PRESTAMOS;
	}
	
	public String toString() {
		return "";
	}
}
