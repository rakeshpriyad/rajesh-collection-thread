package thread;

public class Test extends Thread {
	public void run(){
		for(int i=1;i<100;i++){
			System.out.println(i);
		}
	}
public static void main(String[] args){
	Thread t1=new Test();
	t1.start();
}
}
