package thread;

import java.util.List;

public class Insert1 implements Runnable {
	List<String> lis;
	Boolean process;
	
	public Insert1(List<String> l,Boolean proces){
			this.lis=l;
			this.process=proces;
		
	}
	public void run()
	{
		for(int i=0;i<20;i++){
			lis.add("i");
			System.out.println("inserted val->:"+i);
		}
		process=true;
	}

}
