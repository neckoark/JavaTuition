package LearningOOPS.LearningInheritance.BookletProblems.ClassWork;

class Rectangle{
	String obj = "Rectangle";
	int length;
	int width;
	Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	void printArea(){
		System.out.println("Area of "+obj+ " :"+ this.length*this.width);
	}
	void printPerimeter(){
		System.out.println("Perimeter :"+ 2*(this.length+this.width));
	}
}

class Square extends Rectangle{
	String obj = "Square";
	Square(int side){
		super(side, side);
	}

	public static void main(String[] args) {

		Square s = new Square(5);
		s.printArea();
		s.printPerimeter();

		Rectangle rectangle = new Rectangle(10,3);
		rectangle.printArea();
		rectangle.printPerimeter();
	}
}
