package ConsumeProducerDemo;

public class MyRunnable implements Runnable{
	public void run(){
		System.out.println("in run() Method");
		for(int i=0;i<10;i++){
			System.out.println("i="+i+",ThreadName="+Thread.currentThread().getName());
			
		}
		
	}

}
