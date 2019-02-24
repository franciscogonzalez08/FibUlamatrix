package tarea4;

public class Date {
	// Attributes
	private int day = 1, month = 1, year = 2017;
	private String monthName = "Enero";
	private int format = 0;
	
	// Builders
	public Date() {
		// :)
	}
	
	public Date(int d, int m, int y) {
		setMonth(d);
		setDay(m);
		setYear(y);
	}
	
	public Date(int d, int m, int y, int f) {
		this(d, m, y);
		setFormat(f);
	}
	
	// Setters
	public void setDay(int day) {
		byte limit = monthLimit(month);
		
		if(day >= 1 && day <= limit)
			this.day = day;
	}
	

	public void setMonth(int month) {
		if(month >= 1 && month <= 12)
		{
			this.month = month;
			
			switch (month) {
				case 1: monthName = "Enero"; break; 
				case 2: monthName = "Febrero"; break; 
				case 3: monthName = "Marzo"; break; 
				case 4: monthName = "Abril"; break; 
				case 5: monthName = "Mayo"; break;
				case 6: monthName = "Junio"; break;
				case 7: monthName = "Julio"; break;
				case 8: monthName = "Agosto"; break;
				case 9: monthName = "Septiembre"; break;
				case 10: monthName = "Octubre"; break;
				case 11: monthName = "Noviembre"; break;
				case 12: monthName = "Diciembre"; break;
			}
		}
	}

	public void setYear(int year) {
		if(year >= 1900 && year <= 3000)
			this.year = year;
	}

	public void setFormat(int format) {
		if(format >= 0 && format <= 2)
			this.format = format;
	}
	
	// Getters
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public String getMonthName() {
		return monthName;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getFormat() {
		return format;
	}
	
	// Other methods
	public String toString() {
		String output = "";
		if(format == 0) {
			if (day < 10) output += 0;
			output += day + "/";
			if (month < 10) output += 0;
			output += month + "/";
			int y = year%100; 
			if (y < 10) output += 0;
			output += y;
		} else if (format == 1) {
			output += day + "-" + monthName.substring(0, 3) + "-" + year;
		} else output += day + " de " + monthName.toLowerCase() + " de " + year; 
		
		return output;
	}
	
	public boolean equals(Date d) {
		if (day != d.getDay() || month != d.getMonth() || year != d.getYear()) return false;
		else return true;
	}
	
	public Date clone() {
		return new Date(day, month, year, format);
	}
	
	public void next() {
		byte limit = monthLimit(month);
		
		if (day != limit) {
			day++;
		} else {
			day = 1;
			
			if (month != 12) month++;
			else {
				year++;
				month = 1;
			}
		} 
	}
	
	// Aiding private methods
	private byte monthLimit(int month) {
		byte limit = 0;
		
		switch (month) {
			case 1: 
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: limit = 31; break; 
			case 4:
			case 6:
			case 9:
			case 11: limit = 30; break;
			default: limit = 28; break; // February
		}
		
		return limit;
	}
}
