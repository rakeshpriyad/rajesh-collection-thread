package thread;

public class Demo implements Runnable{
	
	private boolean status=true;
	
	public void run(){
		for(int i=1;i<21;i++){
			System.out.print(i);
				}
status=false;
	}
	public boolean getStatus(){
		return this.status;
		
	}
public static void main(String[] args){
	Demo d=new Demo();
	Thread t=new Thread(d);
	t.start();
	System.out.println(d.getStatus());
}
}
