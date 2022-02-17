package javabasic;

public class Building_Name {

	public static void main(String[] args) {
		/*
		 * 작성자 : 김홍식
		 * 건물에 어떤 업종이 있는지
		 * 작성일자 : 20220125
		 */
		int floor = 3;  //층 수는 3층
		switch(floor) {
		case 1 : System.out.printf("%d층은 약국입니다.",floor);   //층 수가 1층이면 약국
			break;
		case 2 : System.out.printf("%d층은 정형외과입니다.",floor); //층 수가 2층이면 정형외과
			break;
		case 3 : System.out.printf("%d층은 피부과입니다.",floor);  //층 수가 3층이면 피부과
			break;
		case 4 : System.out.printf("%d층은 치과입니다.",floor);  //층 수가 4층이면 치과
			break;
		case 5 : System.out.printf("%d층은 헬스 클럽입니다.",floor); //층 수가 5층이면 헬스클럽
			break;
		}

	}

}
