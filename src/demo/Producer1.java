package demo;

import java.util.List;

public class Producer1 implements Runnable {

	List<String> l;
	Boolean status;

	public Producer1(Boolean s, List<String> lis) {
		this.status = s;
		this.l = lis;
	}

	public void run() {
		for (int i = 0; i < 20; i++) {

			System.out.println("produced value:->" + i);
			l.add("i"+i);
		}
		
		status = true;
	}

}
