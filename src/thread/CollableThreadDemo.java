package thread;

import java.util.concurrent.Callable;

public class CollableThreadDemo implements Callable<String> {

	@Override
	public String call() throws Exception {
		String str="Rajesh";
		
		long i=1;
		while(i<30){
			i++;
		}
		Thread.sleep(500);
		System.out.println(i);
		return str;
	}

}
