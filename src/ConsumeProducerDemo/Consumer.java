package ConsumeProducerDemo;



public class Consumer extends Thread{
	Producer prod;
	
	public Consumer(Producer p){
		prod=p;
		
	}
	public void run(){
		while(this.prod.proces){
			System.out.println("Wait for produce");
			try{
				Thread.sleep(5000);
							}catch(InterruptedException e){
								e.printStackTrace();
							}
			System.out.println("value is produced,Consumer can consumed");
			int produceSize=this.prod.lis.size();
			
			for(int i=0;i<produceSize;i++){
				System.out.println("Consumed:"+this.prod.lis.remove(0)+"");
				
			}
		}
	}

}
