package ConsumeProducerDemo;

public class JoinDemo implements Runnable{
	public void run(){
		System.out.println("in run() Method");
		for(int i=0;i<10;i++){
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("i="+i+",ThreadName="+Thread.currentThread().getName());
			
		}
		
	}

}
