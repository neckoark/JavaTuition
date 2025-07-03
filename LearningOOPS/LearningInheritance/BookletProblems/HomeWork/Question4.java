package LearningOOPS.LearningInheritance.BookletProblems.HomeWork;

class Laptop{
	int noOfUSBPorts;
	int processorSpeed;

	void setNoOfUSBPorts(int noOfUSBPorts){
		this.noOfUSBPorts = noOfUSBPorts;
	}

	void setProcessorSpeed(int processorSpeed){
		this.processorSpeed = processorSpeed;
	}

	void getNoOfUSBPorts(){
		System.out.println("No of USB Ports: " + noOfUSBPorts);
	}
	void getProcessorSpeed(){
		System.out.println("Processor Speed: " + processorSpeed);
	}

	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		laptop.setNoOfUSBPorts(5);
		laptop.setProcessorSpeed(10);

		laptop.getNoOfUSBPorts();
		laptop.getProcessorSpeed();
	}
}

