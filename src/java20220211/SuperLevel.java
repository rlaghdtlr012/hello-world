package java20220211;

public class SuperLevel extends PlayerLevel {
	public int count;
	public void run() {
		System.out.println("천천히 달립니다.");
	}
	public void jump(int count) {
		this.count = count;
		System.out.printf("%d번 점프합니다.\n",count);	
	}
	public void turn() {
		System.out.println("턴 합니다.");	
	}
	public void showLevelMessage() {
		System.out.println("*****Super 레벨입니다.*****");
	}
}
