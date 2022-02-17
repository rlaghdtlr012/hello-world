package javabasic4;

public class StudentTest {

	public static void main(String[] args) {
		Student studentYeon = new Student();
		studentYeon.StudentName = "연주미";
		System.out.println(Student.getSerialNum());
		System.out.println(studentYeon.StudentName+"학번:"+studentYeon.StudentID+" 카드번호:"+studentYeon.studentCardNum);

		Student studentLee = new Student();
		studentLee.StudentName = "이지안";
		System.out.println(Student.getSerialNum());
		System.out.println(studentLee.StudentName+"학번:"+studentLee.StudentID+" 카드번호:"+studentLee.studentCardNum);

	}

}
