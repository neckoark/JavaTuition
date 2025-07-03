package LearningOOPS.LearningInheritance.BookletProblems.HomeWork;

class Department{
	int id;
	String name;
}

class Student extends Department{
	int rollno;
	String name;

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id = 1;
		s1.name = "John Doe";
		s1.rollno = 10;
		System.out.println("Name: " + s1.name + " rollno: " + s1.rollno + " id: " + s1.id);

		Department d1 = new Department();
		d1.id = 1;
		d1.name = "John Doe";
		System.out.println("Id: " + d1.id + " name: " + d1.name);
	}
}