package thread;

import java.util.concurrent.Callable;

public class ACallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		String s="hello";
		/*for(long i=0; i<10000000;i++){
			//System.out.println(i);
		}*/
		long i=0;
		while(i<10000){
			i++;
		}
		Thread.sleep(50);
		return s+i;
	}

}
