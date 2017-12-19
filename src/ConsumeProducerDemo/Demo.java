package ConsumeProducerDemo;

public class Demo {

	public static void main(String[] args){
		
		Producer p=new Producer();
		Consumer c=new Consumer(p);
		
		Thread t1=new Thread(p,"producerThread");
		Thread t2=new Thread(c,"ConsumerThread");
		
		t1.start();
		t2.start();
	}
}
