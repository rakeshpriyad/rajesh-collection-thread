package ConsumeProducerDemo;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Runnable {
	Boolean proces;
	List<Integer>lis;
	
	public Producer(){
		this.proces=true;
		lis=new ArrayList<Integer>();
	}
	@Override
	public void run(){
		for(int i=0;i<10;i++){
			lis.add(i);
			System.out.println("produced :->"+i);
		}
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	proces=false;
	}

}
