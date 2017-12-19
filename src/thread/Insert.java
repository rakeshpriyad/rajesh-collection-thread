package thread;

import java.util.List;

public class Insert implements Runnable{
	List<String> lis;
	
	public Insert(List<String> l){
		this.lis=l;
		
	}
	public void run(){
		for(int i =0;i<20; i++){
			lis.add("i"+i);
			System.out.println("value inserted->"+i);
		}
			synchronized (this) {
			this.notify();
}
			
	}
}