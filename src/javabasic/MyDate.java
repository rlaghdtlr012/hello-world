package javabasic;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;
	
	public int getDay(int day) {
		return day;
	}
	public int getMonth(int month) {
		return month;
	}
	public int getYear(int year) {
		return year;
	}
	public void setDay(int day) {
		if(month == 2) {
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				if(day<1 || day > 29) {
					isValid = false;
				}else {
					this.day = day;
				}
			}else {
				if(day<1 || day > 28) {
				isValid = false;
				}else {
					this.day = day;
			}
				
			}
			
		}
		else if(month == 1 ||month == 3 ||month == 5 ||month == 7 ||month == 8 ||month == 10 || month == 12) {
			if(day<1 || day > 31) {
				isValid = false;
			}else {
				this.day = day;
			}
		}
		else if(month == 4 ||month == 6 ||month == 9 ||month == 11) {
			if(day<1 || day > 31) {
				isValid = false;
			}else {
				this.day = day;
			}
		}
	}
	public void setMonth(int month) {
		if (month<1 || month>12) {
			isValid = false;
		}else {
			this.month = month;	
		}
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public MyDate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	public void isValid() {
		if (isValid) {
			System.out.println("유효한 날짜입니다.");
		}else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}

}