package demo;

import java.util.List;

public class Consumer1 implements Runnable {
	Boolean status;
	List<String> list;
	Producer1 p;

	public Consumer1(Producer1 p, List<String> lis) {
		this.p = p;
		this.list = lis;

	}

	public void run() {
		try {
			while (!p.status) {
				Thread.sleep(2000);
			}
			for (int i = 0; i < list.size(); i++) {
				String s = list.remove(i);
				System.out.println("Consumed value " + s);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
