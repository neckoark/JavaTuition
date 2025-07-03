package LearningOOPS.LearningInheritance.Day2;

public class Company {
	void company(){
		System.out.println("Company");
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.company();
		e.employee();
	}
}

class Employee extends Company{
	void employee(){
		System.out.println("Employee");
	}
}
