package collections;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;

public class Student2 extends Thread {
	
protected BlockingQueue<String> blockingQueue;
final Random random=new Random();

public Student2(BlockingQueue<String> queue){
	this.blockingQueue=queue;
}
@Override
public void run(){
	while(true){
		try{
			String data=UUID.randomUUID().toString();
			System.out.println(data);
			blockingQueue.put(data);
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
}
