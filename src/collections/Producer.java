package collections;

import java.util.concurrent.BlockingQueue;

public class Producer extends Thread {

	private BlockingQueue<String> synQue;
	
	public Producer(BlockingQueue<String> synQue) {
		this.synQue = synQue;
	}
	
	@Override
	public void run() {
		
		for(int i=0; i<10; i++){
			try {
				synQue.put("value-->"+i);
				System.out.println("Inserted : "+"value-->"+i);
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
}
