package collections;

public class ArrayListCustomApp{
	
	public static void main(String[] args){
		ArrayListCustom<Integer> list=new ArrayListCustom<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		list.display();
		System.out.println("element of index"+1+"="+list.get(1));
		System.out.println("element removed from index"+1+"="+list.reemove(1));
		System.out.println("display after removed index");
		list.display();

	}
}
