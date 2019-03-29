import java.time.LocalDate;

public class Estudiante extends Prestamista {
	//Attributes
	private static byte MAX_PRESTAMOS = 20;
	private String carrera;
	private LocalDate incio;
	
	//Methods
	@Override
	public byte maxPrestamos() {
		return MAX_PRESTAMOS;
	}
	
	public String toString() {
		return "";
	}

}
