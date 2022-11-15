/*W.A.J.P to create a class Student with attributes roll no, name, age and course. 
 Initialize values through parameterized constructor. 
 If age of student is not in between 15 and 21 then generate user defined exception "AgeNotWithinRangeException". 
 If name contains numbers or special symbols raise exception "NameNotValidException". Define the two exception classes. 
 */
package assignment;

class Student{
	int rollno,age;
	String name,course;
	
	public Student(int rn, String name, int age, String course) {
		this.rollno=rn;
		this.name=name;
		this.age=age;
		this.course=course;
	}
	
	public void display() {
		System.out.println("Roll no : "+rollno+"\nName : "+name+"\nAge : "+age+"\nCourse : "+course);
	}
	
}

class AgeNotWithinRangeException extends Exception{
	
	public String toString(){
		return("Age not within range");
	}
}
class NamenotValidException extends Exception{
	public String toString(){
		return("Name is not  valid,  Please enter the Name: ");
	}
}

public class A42 {
	
	public static void main(String[] args)throws AgeNotWithinRangeException, NamenotValidException {
		Student s=new Student(1, "Hemant", 26, "Java");
		
		s.display();
	}
}