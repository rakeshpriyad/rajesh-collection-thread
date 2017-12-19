package demo;

import java.util.ArrayList;
import java.util.List;

public class SpiningChainDemo {
	
	public static void main(String[] args){
		Boolean status=false;
		List<String> list=new ArrayList<String>();
	
		Producer1 p1=new Producer1(status,list);
		Consumer1 c1=new Consumer1(p1,list);
		
		Thread t1=new Thread(p1);
		Thread t2=new Thread(c1);
		
		t1.start();
		t2.start();
		
	}

}
