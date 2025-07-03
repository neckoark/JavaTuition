package LearningOOPS.LearningInheritance.BookletProblems.ClassWork;

class Member{
	String name;
	int age;
	String phonenumber;
	String address;
	int salary;

	void printSalary(){
		System.out.println("Salary: " + salary);
	}
}

class Employee extends Member{
	String specialization;
}

class Manager extends Member{
	String department;
}

class Use{
	public static void main(String[] args) {

		Employee e = new Employee();
		e.name = "John Smith";
		e.age = 21;
		e.salary = 50000;
		e.phonenumber = "987654321";
		e.specialization = "Engineering";
		e.address = "San Francisco";
		System.out.println("Employee Name: " + e.name+ " Age: " + e.age);
		e.printSalary();

		Manager m = new Manager();
		m.name = "John Smith";
		m.age = 21;
		m.phonenumber = "987654321";
		m.address = "Main Street";
		m.department = "Production";
		m.salary = 10000;
		m.printSalary();
	}
}