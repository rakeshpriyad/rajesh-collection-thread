package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableThread {

	public static void main(String[] args) {
		CollableThreadDemo ctd = new CollableThreadDemo();
		
		List<CollableThreadDemo> colList = new ArrayList<>();
		colList.add(ctd);
		colList.add(new CollableThreadDemo());
		colList.add(new CollableThreadDemo());
		colList.add(new CollableThreadDemo());
		
		Thread t= new Thread();
		ExecutorService e = Executors.newSingleThreadExecutor();
		e.execute(t);
		
		
		
		try {
			List<Future<String>> f = e.invokeAll(colList);
			System.out.println(f.get(0));
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		} 
		
		RunnableThreadDemo rtd = new RunnableThreadDemo();
		e.submit(rtd);

	}

}
