package thread;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentDemo {
	public static void main(String[] args)
	{
		ConcurrentHashMap<Integer,String> chm=new ConcurrentHashMap<Integer,String>();
		chm.put(1,"C++");
		System.out.println("ConcurrentHashMap1:"+chm);
		System.out.println("\n putifAbsent"+chm.putIfAbsent(5, "Rajesh"));
		System.out.println("ConcurrentHashMap2:"+chm);
		System.out.println("\n putifAbsent Method:"+chm.putIfAbsent(7, "Aayush"));
		System.out.println("ConcurrentHashMap3"+chm);
		System.out.println("\n putifAbsent Method:"+chm.putIfAbsent(7, "dbbdj"));
		System.out.println("ConcurrentHashMap3"+chm);
		System.out.println("\n putifAbsent Method:"+chm.putIfAbsent(7, "sma "));
		System.out.println("ConcurrentHashMap3"+chm);
		
	}

}
