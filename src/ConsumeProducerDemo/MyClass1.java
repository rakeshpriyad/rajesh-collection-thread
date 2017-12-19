package ConsumeProducerDemo;

public class MyClass1 {

	public static void main(String...args) throws InterruptedException{
		System.out.println("in main() method");
	JoinDemo jd=new JoinDemo();
	Thread t2=new Thread(jd);
	Thread t3=new Thread(jd);
	
	t2.start();
	t2.join(1000);
	t3.start();
	t3.join();
	System.out.println("Main method end");
	}
	{
		
	}
}
