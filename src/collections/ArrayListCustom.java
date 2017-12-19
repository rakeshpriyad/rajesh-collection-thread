package collections;

import java.util.Arrays;

public class ArrayListCustom<E>{
	private static final int INITIAL_CAPACITY=10;
	
	private Object elementData[]={};
	private int size=0;
	
	public ArrayListCustom(){
		elementData=new Object[INITIAL_CAPACITY];
		
	}
	public void add(E e){
		if(size==elementData.length){
			ensureCapacity();
			
		}
		elementData[size++]=e;
		
	}
	@SuppressWarnings("unchecked")
	public E get(int index){
		if(index<0||index>=size){
			throw new IndexOutOfBoundsException("index"+index+",size"+index);
		}
			return (E) elementData[index];
		
		}
	
		public Object reemove(int index){
			if(index<0||index>=size){
				throw new IndexOutOfBoundsException("index"+index+",size"+index);
		}
			Object removedElement=elementData[index];
			for(int i=index;i<size;i++){
				elementData[i]=elementData[i+1];
					}
		size--;
		return removedElement;
		}
private void ensureCapacity(){
	int newIncreasedCapacity=elementData.length*1;
	elementData=Arrays.copyOf(elementData, newIncreasedCapacity);
	
}
public void display(){
	System.out.println("Displaying List:");
	for(int i=0;i<size;i++)
	{
		System.out.println(elementData[i]+" ");
		
	}
}
}
