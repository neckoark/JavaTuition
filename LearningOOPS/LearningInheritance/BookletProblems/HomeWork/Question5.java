package LearningOOPS.LearningInheritance.BookletProblems.HomeWork;

class IPLTeam{
	void play(){
		System.out.println("IPL Team");
	}
}

class CSK extends IPLTeam{
	public static void main(String[] args) {
		CSK obj = new CSK();
		obj.play();
	}
}

class RCB extends IPLTeam{
	public static void main(String[] args) {
		RCB obj = new RCB();
		obj.play();
	}
}
