package java20220217;
import java.util.ArrayList;

public class Sample extends Thread {
    int seq;

    public Sample(int seq) {
        this.seq = seq;
    }

    public void run() {
        System.out.println(this.seq + " thread start.");  // ������ ����
        try {
            Thread.sleep(1000);  // 1�� ����Ѵ�.
        } catch (Exception e) {
        }
        System.out.println(this.seq + " thread end.");  // ������ ���� 
    }

    public static void main(String[] args) {
    	ArrayList<Thread> threads = new ArrayList<>();
    	for (int i = 0; i < 10; i++) {  // �� 10���� �����带 �����Ͽ� �����Ѵ�.
            Thread t = new Sample(i);
            t.start();
            threads.add(t);
        }
    	for(int i = 0;i<threads.size();i++) {
    		Thread t = threads.get(i);
    		try {
    			t.join(); //�����尡 ����� ������ ��ٸ���.
    		}catch(Exception e) {
    		}
    	}
        System.out.println("main end.");  // main �޼ҵ� ����
    }
}