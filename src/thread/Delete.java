package thread;

import java.util.List;

import demo.Producer2;

public class Delete implements Runnable{
	List<String> list;
	Insert ins;
public Delete(Insert in,List<String> l){
	this.list=l;
	this.ins=in;
}
public void run(){
	synchronized (this.ins) {
		System.out.println("waiting");
		try{
			this.ins.wait(20000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("insert ic completed");
		for(int i=0;i<list.size();i++){
		String s=list.remove(i);
		System.out.println("deleted value"+s);
		}
	}
}
}
	