package test;

import tarea4.Date;

public class TestDate {

	public static void main(String[] args) {
		// Crear d1 como la fecha predeterminada.
		Date d1 = new Date();
		// Crear d2 como la fecha 31 de Diciembre de 2016
		Date d2 = new Date(31, 12, 2016);
		// Crear d3 como el clon de d1
		Date d3 = d1.clone();
		// Crear d4: con el día de d1, el mes de d2, el año de d3 y el formato 1
		Date d4 = new Date(d1.getDay(), d2.getMonth(), d3.getYear(), 1);
		// Crear d5 y asignar la fecha correspondiente al siguiente día de d2 (2 lineas)
		Date d5 = new Date(d2.getDay(), d2.getMonth(), d2.getYear());
		d5.next();
		// Cambiar el mes de d3 a Abril
		d3.setMonth(4);
		// Imprimir en consola el resultado de comparar d1 y d3
		System.out.println(d1.equals(d3));
		// Imprimir en consola el resultado de comparar d1 y d5
		System.out.println(d1.equals(d5));
		/* Imprimir en consola las cinco fechas anteriores en los tres formatos. 
		Para ello, guarde las fechas en un arreglo y utilice ciclo for-each (5 lineas) */
		Date[] arrDates = {d1, d2, d3, d4, d5};
		for(Date d : arrDates)
			for(byte i = 0; i <= 2; i++) {
				d.setFormat(i);
				System.out.println(d.toString()); 
			} // <-- not a line (come on)
			
	}

}
