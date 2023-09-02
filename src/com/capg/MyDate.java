package com.capg;

class MyDate {
	private int day,month,year;

    public MyDate() {
        day=22;
        month=4;
        year=2023;
    }
  
	public MyDate(int day,int month,int year) {
		this();
        this.day=day;
        this.month=month;
        this.year=year;
    }
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
    public void display() {
        System.out.println("Date is:" +day+ "-"+month+"-"+year);
    }
}
