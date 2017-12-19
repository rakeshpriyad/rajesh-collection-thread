package collections;

import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread {
	private BlockingQueue<String> synQue;
	String val = "value-->9";

	public Consumer(BlockingQueue<String> synQue) {
		this.synQue = synQue;
	}

	@Override
	public void run() {
		String d = "";
		while (!d.equals(val)) {
			try {
				d = synQue.take();
				System.out.println("Consumed : " +d);
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
