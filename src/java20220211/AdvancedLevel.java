package java20220211;

public class AdvancedLevel extends PlayerLevel {
	public int count;
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}
	public void jump(int count) {
		this.count =count;
		System.out.printf("%d�� �����մϴ�.\n",count);	
	}
	public void turn() {
		System.out.println("���ϱ⿡ ������ �����մϴ�.");	
	}
	public void showLevelMessage() {
		System.out.println("*****Advanced �����Դϴ�.*****");
	}
}
