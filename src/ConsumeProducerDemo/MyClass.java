package ConsumeProducerDemo;

public class MyClass {

	public static void main(String...args) throws InterruptedException{
		System.out.println("in main() method");
	MyRunnable run1=new MyRunnable();
	Thread t2=new Thread(run1);
	Thread t3=new Thread(run1);
	
	t2.start();
	t2.join();
	t3.start();
	t3.join();
	System.out.println("Main method end");
	}
	{
		
	}
}
