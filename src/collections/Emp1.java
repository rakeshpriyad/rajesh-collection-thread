package collections;

import java.util.concurrent.BlockingQueue;

public class Emp1 implements Runnable{
	
	protected BlockingQueue<String> queue=null;
	
	public Emp1(BlockingQueue<String>queue){
		this.queue=queue;
	}
public void run(){
	try{
		queue.put("hello");
		Thread.sleep(2000);
		queue.put("Rajesh");
		Thread.sleep(2000);
		queue.put("How r u");
		Thread.sleep(2000);
		queue.put("hello");
		Thread.sleep(2000);
		queue.put("Aayush");
		Thread.sleep(2000);
		queue.put("I am good");
		Thread.sleep(2000);
		queue.put("and You");
		
	}catch(InterruptedException e){
		e.printStackTrace();
	}
}
}
