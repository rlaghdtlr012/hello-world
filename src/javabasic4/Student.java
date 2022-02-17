package javabasic4;

public class Student {
	private static int serialNum = 1000;
	int StudentID = 12312;
	static int studentCardNum;
	String StudentName;
	
	
	public Student() {
		//학생이 생성될 때마다 증가
		serialNum++;
		//증가된 값을 학번, 카드번호 인스턴스에 부여
		StudentID = serialNum;
		studentCardNum = StudentID + 100;
	}


	public static int getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}

}
