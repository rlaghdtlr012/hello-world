package javabasic4;

public class StudentTest {

	public static void main(String[] args) {
		Student studentYeon = new Student();
		studentYeon.StudentName = "���ֹ�";
		System.out.println(Student.getSerialNum());
		System.out.println(studentYeon.StudentName+"�й�:"+studentYeon.StudentID+" ī���ȣ:"+studentYeon.studentCardNum);

		Student studentLee = new Student();
		studentLee.StudentName = "������";
		System.out.println(Student.getSerialNum());
		System.out.println(studentLee.StudentName+"�й�:"+studentLee.StudentID+" ī���ȣ:"+studentLee.studentCardNum);

	}

}
