import java.time.LocalDate;

public class Egresado extends Prestamista {
	//Attributes
	private static byte MAX_PRESTAMOS = 10;
	private String carrera;
	private LocalDate egreso;

	//Methods
	@Override
	public byte maxPrestamos() {
		return MAX_PRESTAMOS;
	}
	
	public String toString() {
		return "";
	}
}
