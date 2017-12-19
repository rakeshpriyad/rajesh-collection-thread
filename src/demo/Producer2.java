package demo;

import java.util.List;

public class Producer2 implements Runnable {

	List<String> lis;

	public Producer2(List<String> l) {
		this.lis = l;
	}

	public void run() {

		for (int i = 0; i < 30; i++) {
			lis.add("i" + i);
			System.out.println("Value Produced " + i);
		}

		synchronized (this) {
			this.notify();
		}

	}
}
