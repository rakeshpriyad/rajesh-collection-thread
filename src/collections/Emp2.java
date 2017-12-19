package collections;

import java.util.concurrent.BlockingQueue;

public class Emp2 implements Runnable {

	protected BlockingQueue<String> bQueue;

	public Emp2(BlockingQueue<String> queue) {
		this.bQueue = queue;

	}

	@Override

	public void run() {
		while (true) {
			try {
				String d = bQueue.take();
				System.out.println(Thread.currentThread().getName() + d);
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
