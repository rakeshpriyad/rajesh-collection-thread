package demo;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	protected BlockingQueue<Integer> bq;
	public Producer(BlockingQueue<Integer> q)
	{
		this.bq=q;
		
	}
	public void run(){
		for(int i=0; i<10; i++){
			try {
				bq.put(i);
				System.out.println("Inserted : "+"value-->"+i);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
