package demo;

import java.util.ArrayList;
import java.util.List;

public class WaitNotifyDemo {
	public static void main(String[] args){
		List<String> l=new ArrayList<String>();
		Producer2 p2=new Producer2(l);
		Consumer2 c2=new Consumer2(p2,l);
		
		Thread t1=new Thread(p2);
		Thread t2=new Thread(c2);
		
		t1.start();
		t2.start();
		
	}

}
