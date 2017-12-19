package thread;

import java.util.ArrayList;
import java.util.List;

public class InsertDeleteDemo {
public static void main(String...args){
	List<String> list=new ArrayList<String>();
	
	Insert in=new Insert(list);
	Delete del=new Delete(in,list);
	Thread t1=new Thread(in);
	Thread t2=new Thread(del);
	
	t1.start();
	t2.start();
}
}
