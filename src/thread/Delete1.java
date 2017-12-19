package thread;

import java.util.List;

public class Delete1 implements Runnable {
	List<String> l;
	boolean status;
	Insert1 in1;

	public Delete1(List<String> lis, Insert1 in) {
		this.l = lis;
		this.in1 = in;
	}

	public void run() {
		try {
			while (!in1.process) {
				Thread.sleep(5000);
			}
			System.out.println("waiting");
			for (int i = 0; i < 10; i++) {
				l.remove(i);
				System.out.println("removed value->:" + i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
