package thread;

public class ThreadDemo implements Runnable {
	
	public void run(){
		for(int i=1;i<21;i++)
		{
			System.out.println(i);
		}
	}
public static void main(String[] args){
	ThreadDemo td=new ThreadDemo();
	Thread t1=new Thread(td);
	t1.start();
}
}
