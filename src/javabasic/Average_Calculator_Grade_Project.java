package javabasic;

public class Average_Calculator_Grade_Project {

	public static void main(String[] args) {
		/*
		 * �ۼ��� : ��ȫ��
		 * ���� �����
		 * �ۼ����� : 20220125
		 */
		double avg = 95.7;  // ������ 95.7��
		String grade="";
		if(avg>=95) {      //������ 95�� �̻��̸� grade�� A+
			grade="A+";
		}
		else if(avg>=90){  //������ 90�� �̻��̸� grade�� A0
			grade="A0";
		}
		else if(avg>=85){  //������ 85�� �̻��̸� grade�� B+
			grade="B+";
		}
		else if(avg>=80){  //������ 80�� �̻��̸� grade�� B0
			grade="B0";
		}
		else if(avg>=70){  //������ 70�� �̻��̸� grade�� C
			grade="C";
		}
		else if(avg>=60){  //������ 60�� �̻��̸� grade�� D
			grade="D";
		}
		else {
			grade="F";  // �� �� ������ grade�� F
		}
		System.out.println("����� ������ "+ grade +"�Դϴ�.");
	}

}