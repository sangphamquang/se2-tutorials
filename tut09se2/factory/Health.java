package tut09se2.factory;

// Creating the Health class that extends Course abstract class 
class Health extends Course {
	// TO-DO: Implement getDuration() method: set a specific duration and print value
	public void getDuration() {
            duration = 7;
            System.out.println("Duration:" +duration);
	}

	// TO-DO: Implement getFeePerSemester() method: set a specific duration and print value
	public void getFeePerSemester() {
            fee = 6;
            System.out.println("Fee:"+ fee);
	}
}// end of Health class.