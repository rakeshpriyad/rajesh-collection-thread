package demo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MainDemo {
	
	public static void main(String[] args){
		BlockingQueue<Integer> bqueue=new ArrayBlockingQueue<>(2);

		Producer p=new Producer(bqueue);
		Consumer c=new Consumer(bqueue);
		
		Thread thrd1=new Thread(p);
		Thread thrd2=new Thread(c);
		
		thrd1.start();
		thrd2.start();
		
	}
	

}
