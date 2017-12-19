package collections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockQueueDemo {

	public static void main(String[] args) throws Exception {
		BlockingQueue<String> bq=new ArrayBlockingQueue<String>(1024);
		
		Student1 stud=new Student1(bq);
		Emp1 emp=new Emp1(bq);
		new Thread(stud).start();
		new Thread(emp).start();
		
		Thread.sleep(4000);
		
	}
}
