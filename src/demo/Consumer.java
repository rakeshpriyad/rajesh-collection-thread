package demo;

import java.util.concurrent.BlockingQueue;

public class Consumer  implements Runnable{
	
	protected BlockingQueue<Integer> bque;
	
	public Consumer(BlockingQueue<Integer> bq){
		this.bque=bq;
	}
public void run(){
	
for(int i=0;i<10;i++){
	Integer it;
	try {
		it = bque.take();
		System.out.println("consumed "+it);

	} catch (InterruptedException e) {
		e.printStackTrace();
		
	}
	
	}
}
}
