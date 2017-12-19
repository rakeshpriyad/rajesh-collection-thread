package collections;

import java.util.concurrent.BlockingQueue;

public class Student1 implements Runnable{
	protected BlockingQueue<String>bQueue=null;
	
	public Student1(BlockingQueue<String>bQueue){
		this.bQueue=bQueue;
	}
public void run(){
	try{
		System.out.println(bQueue.take());
		System.out.println(bQueue.take());
		System.out.println(bQueue.take());
		System.out.println(bQueue.take());
		System.out.println(bQueue.take());
		System.out.println(bQueue.take());
		System.out.println(bQueue.take());
		}catch(InterruptedException e){
			e.printStackTrace();
		}
}
}
