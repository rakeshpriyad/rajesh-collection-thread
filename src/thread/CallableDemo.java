package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) {
		ACallable c = new ACallable();
		
		List<ACallable> taskList = new ArrayList<>();
		taskList.add(c);
		taskList.add(new ACallable());
		taskList.add(new ACallable());
		taskList.add(new ACallable());
		taskList.add(new ACallable());
		taskList.add(new ACallable());
		taskList.add(new ACallable());
		taskList.add(new ACallable());
		taskList.add(new ACallable());
		taskList.add(new ACallable());
		
		Thread t= new Thread();
		//ExecutorService e = Executors.newFixedThreadPool(3);
		ExecutorService e = Executors.newSingleThreadExecutor();
		e.execute(t);
		//e.submit(task, result)
		
		
		
		try {
			List<Future<String>> f = e.invokeAll(taskList);
			System.out.println("returned value--" + f.get(0));
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		
		ARunnable task = new ARunnable();
		e.submit(task);

	}

}
