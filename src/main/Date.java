package main;

import java.text.DecimalFormat;

public class Date {
	private int day;    //1..31
	private int month;  //1..12
	private int year;


	public Date() {
		day = 1;
		month = 1;
		year = 2018;
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	
	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public String getDateString() {
		DecimalFormat f = new DecimalFormat("00");
		return f.format(day) + "/" + f.format(month) + "/" + year;
	}

	@Override
	public String toString() {
		return "main.Date: " + day + "-" + month + "-" + year;
	}
	
}
