package java20220211;

public class SuperLevel extends PlayerLevel {
	public int count;
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}
	public void jump(int count) {
		this.count = count;
		System.out.printf("%d�� �����մϴ�.\n",count);	
	}
	public void turn() {
		System.out.println("�� �մϴ�.");	
	}
	public void showLevelMessage() {
		System.out.println("*****Super �����Դϴ�.*****");
	}
}
