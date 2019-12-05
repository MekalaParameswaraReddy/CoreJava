package com.paru.staticc;

public class Student {
	/**
	 * instance variable declaration.
	 */
	int roll_no;
	float marks;
	String name;
	int instanceCount = 0;

	/**
	 * static variable declaration.
	 */
	static String College_Name = "ITM";
	static int staticCount = 0;

	/**
	 * Instance variable get the memory at the time of object creation. each
	 * object creation will have the copy of instance variable, if it is
	 * incremented it will not reflected to other objects.
	 * 
	 * static variable gets memory at the time of class loading i.e. only one
	 * time. if any object changes value of static variable it will reflect to
	 * all other objects.
	 * 
	 * By using 'staticCount' variable we can count how many object are created
	 * for this class
	 */
	Student() {
		instanceCount++;
		staticCount++;
	}

	/**
	 * static block will execute even before main method
	 */
	static {
		System.out.println("it will execute even before main method");
	}

	/**
	 * static method will allow only static content.
	 * 
	 * non-static variables are not allowed in static method.
	 */
	public static void test() {
		College_Name = "xyz";
		// roll_no = 10; // compile time error.
	}

	/**
	 * non-static method will allow both static and non static variables.
	 */
	public void instanceTest() {
		College_Name = "xyz";
		roll_no = 10;
	}

	public static void main(String[] args) {
		System.out.println("main method strts");
		Student s1 = new Student();
		s1.roll_no = 100;
		s1.marks = 95.5f;
		s1.name = "raja";
		// Object one (s1) is changed static variable (College_Name) data, same
		// is reflecting to s2 obj
		s1.College_Name = "G.V.R & s";
		System.out.println(s1.roll_no);
		System.out.println(s1.marks);
		System.out.println(s1.name);

		System.out.println(s1.instanceCount); // O/P : 1
		System.out.println(Student.staticCount); // O/P : 1
		// Object is not required to call static variable.
		System.out.println(Student.College_Name);

		Student s2 = new Student();
		s2.roll_no = 101;
		s2.marks = 91.5f;
		// Do observer that s1.name = "raja"; but it is not reflected to s2.name
		// s2.name = "rani"; O/P : null
		System.out.println(s2.roll_no);
		System.out.println(s2.marks);
		System.out.println(s2.name);
		System.out.println(s2.College_Name);
		System.out.println(s2.instanceCount);// O/P : 1
		System.out.println(Student.staticCount);// O/P : 2

		// Object is not required to call static method.
		Student.test();
	}

}