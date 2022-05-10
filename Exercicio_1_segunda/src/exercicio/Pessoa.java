package exercicio;

import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;

public class Pessoa {
	
	private String name="",height="";
	private int day=0,month=0,year=0,age=0;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}
	
	public int calcAge() {
		LocalDate birthDate = LocalDate.of(year, month, day);
		LocalDate currentDate = LocalDate.of(2022, 9, 5);
		
		return age = Period.between(birthDate, currentDate).getYears();
	}
}
