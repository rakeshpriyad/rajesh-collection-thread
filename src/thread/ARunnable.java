package thread;

public class ARunnable implements Runnable {

	@Override
	public void run()  {
		//String s="hello";
		/*for(long i=0; i<10000000;i++){
			//System.out.println(i);
		}*/
		
		try {
			long i=0;
			while(i<10000000){
				i++;
				System.out.println(" xxxxxx"+i);
			}
			Thread.sleep(500000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
