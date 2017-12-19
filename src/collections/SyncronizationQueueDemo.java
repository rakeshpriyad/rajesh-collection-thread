package collections;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SyncronizationQueueDemo {

	public static void main(String[] args) {
		final BlockingQueue<String> synQue = new SynchronousQueue<String>();

		/*Student2 st2 = new Student2(synDemo);
		new Thread(st2).start();
		Emp2 e2 = new Emp2(synDemo);
		new Thread(e2).start();

		Emp2 e3 = new Emp2(synDemo);
		new Thread(e3).start();*/
		
		Producer p = new Producer(synQue);
		Consumer c = new Consumer(synQue);
		p.start();
		c.start();
	}
}
