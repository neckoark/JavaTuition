package LearningOOPS.LearningInheritance.BookletProblems.HomeWork;

class Kid{
	void readBook(){
		System.out.println("Reading Book");
	}

	void readBook(String title, String author){
		System.out.println("Reading Book: " + title + " Author: " + author );
	}
}

class BigKid extends Kid{
	void readBook(){
		System.out.println("Reading Book overridden");
	}

	public static void main(String[] args) {
		BigKid kid = new BigKid();

		kid.readBook();
		kid.readBook("Pride and Prejudice", "Jane Austen");
	}
}
