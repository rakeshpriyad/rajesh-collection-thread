package thread;

import java.util.ArrayList;
import java.util.List;

public class InDelDemo {
	public static void main(String...args){
		Boolean status=false;
		List<String> list=new ArrayList<String>();
		
		Insert1 in=new Insert1(list, status);
		Delete1 d1=new Delete1(list,in);
		
		Thread t1=new Thread(in);
		Thread t2=new Thread(d1);
	
		t1.start();
		t2.start();
	}

}
