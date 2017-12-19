package collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkListDemo {

	private static Deque<Student> stdl = new LinkedList<Student>();

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Student s = new Student("roll" + i, "name" + i, "dob" + i, "course" + i, "addr" + i);
			addStudent(s);
		}
		Student stud = stdl.getFirst();
		System.out.println(stud.getRoll());
		System.out.println(stud.getName());
		System.out.println(stud.getDob());
		System.out.println(stud.getCourse());
		System.out.println(stud.getAddr());
		stdl.offer(stud);
		System.out.println(stdl.size());
		stdl.poll();
	}

	public static void addStudent(Student stud) {
		if (stud != null) {
			stdl.add(stud);
		}
	}

	public static void poll() {
		Iterator<Student> it = stdl.iterator();
		while (it.hasNext()) {

			Student s = it.next();
			System.out.println(s.getRoll());
			System.out.println(s.getName());
			System.out.println(s.getCourse());
			System.out.println(s.getDob());
			System.out.println(s.getAddr());
		}
	}
}
