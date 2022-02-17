package java20220211;

public class BeginnerLevel extends PlayerLevel {
	public int count;
	public void run() {
		System.out.println("천천히 달립니다.");
	}
	public void jump(int count) {
		this.count = count;
		System.out.println("점프하기에 레벨이 부족합니다.");	
	}
	public void turn() {
		System.out.println("턴하기에 레벨이 부족합니다.");	
	}
	public void showLevelMessage() {
		System.out.println("*****초보자 레벨입니다.*****");
	}
}
