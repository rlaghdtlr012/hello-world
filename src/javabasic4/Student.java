package javabasic4;

public class Student {
	private static int serialNum = 1000;
	int StudentID = 12312;
	static int studentCardNum;
	String StudentName;
	
	
	public Student() {
		//�л��� ������ ������ ����
		serialNum++;
		//������ ���� �й�, ī���ȣ �ν��Ͻ��� �ο�
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
