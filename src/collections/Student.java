package collections;

public class Student {
private String roll;
private String name;
private String dob;
private String addr;
private String course;
public Student(String string, String string2, String string3, String string4, String string5) {
	// TODO Auto-generated constructor stub
	this.setRoll("5");
	this.setName("Rajesh");
	this.setCourse("mca");
	this.setDob("10/12/1992");
	this.setAddr("delhi");
}
public String getRoll() {
	return roll;
}
public void setRoll(String roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
}
