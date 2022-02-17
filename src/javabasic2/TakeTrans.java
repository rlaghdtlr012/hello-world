package javabasic2;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentChris = new Student("Chris",5000);
		Student studentEmily = new Student("Emily",10000);
		Student studentJenna = new Student("Jenna",50000);
		Bus bus100 = new Bus(100);
		studentChris.takeBus(bus100);
		studentChris.showinfo();
		bus100.showinfo();
		
		Subway subwayGreen = new Subway("2È£¼±");
		studentEmily.takeSubway(subwayGreen);
		studentEmily.showinfo();
		subwayGreen.showinfo();
		
		Taxi taxi3885 = new Taxi(3885);
		studentJenna.takeTaxi(taxi3885);
		studentJenna.showinfo();
		taxi3885.showinfo();
	}

}
