package tut09se2.factory;

// Create the Computer class that extends Courses abstract class 
class Computer extends Course {
	// TO-DO: Implement getDuration() method: set a specific duration and print value
	public void getDuration() {
            duration = 9;
            System.out.println("Duration:" + duration);
	}

	// TO-DO: Implement getFeePerSemester() method: set a specific duration and print value
	public void getFeePerSemester() {
            fee = 8;
            System.out.println("Fee: "+ fee);
	}
} 
