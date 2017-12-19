package demo;

import java.util.List;

public class Consumer2 implements Runnable {
	List<String> l;
	Producer2 prod;

	public Consumer2(Producer2 p, List<String> lis) {
		this.prod = p;
		this.l = lis;
	}

	public void run() {
		synchronized (this.prod) {
			System.out.println("Waiting");
			try {
				this.prod.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("produced is completed");
		for (int i = 0; i < l.size(); i++) {
			String s = l.remove(i);
			System.out.println("consuming -- " + s);
		}
	}

}
