package LearningOOPS.LearningInheritance.MultipleInheritance;

// Cannot override method with final keyword
final class whoo{
	void whoo(){
		System.out.println("whoo");
	}
}

public class FInalKeyword {
	FInalKeyword(String s){
		System.out.println(s);
	}

}

class Random extends FInalKeyword {
	Random(){
		super("Bakabaka");
		System.out.println("Random");
	}
	int rand;
	//final int a;
	public static void main(String[] args) {
		Random rand = new Random();

		System.out.println(rand.rand);

	}

//	void add(){
//		System.out.println("cannot be overrided");
//	}

}

