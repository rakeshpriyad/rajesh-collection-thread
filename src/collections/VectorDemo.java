package collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	private static Vector<Emp> empVect=new Vector<Emp>();
	public static void main(String[] args) {

		for(int i=0;i<10;i++){
			Emp e=new Emp("id"+i,"name"+i,"age"+i,"dob"+i);
			addEmp(e);
		}
		displayVectors();
	}
public static void addEmp(Emp emp){
	if(emp!=null){
		empVect.add(emp);
	}
}
public static void displayVectors(){
	Enumeration<Emp> empEnum=empVect.elements();
	while(empEnum.hasMoreElements()){
		Emp emp=empEnum.nextElement();
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getDob());
	}
}
}
