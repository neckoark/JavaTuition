package LearningOOPS.LearningInheritance.BookletProblems.HomeWork;

//Scenario: In a company there are employees with two designations Manager and Trainee.
//Both employees share the same set of attributes and basic salary calculation logic is same but
//the basic salary of trainee and manager are different.

class Employee{
	String name;
	int age;
	int id;
	int travelAllowance;
	int basicSalary=15000;
	void calculateTravelAllowance(){
		int travelAllowance = 10*basicSalary/100;
		System.out.println("Employee Travel Allowance: "+travelAllowance);
	}
}

class Manager extends Employee{
	int basicSalary = 20000;
	int travelAllowance;
	void calculateTravelAllowance(){
		int travelAllowance = 15*basicSalary/100;
		System.out.println("Manager Travel Allowance: "+travelAllowance);
	}
}

class Trainee extends Employee{
	int basicSalary = 15000;
}

class InheritanceActivity{
	public static void main(String[] args) {

		Manager m = new Manager();
		m.name = "ABC";
		m.id = 11;
		m.calculateTravelAllowance();

		Trainee t = new Trainee();
		t.name = "DEF";
		t.id = 12;
		t.calculateTravelAllowance();

	}
}