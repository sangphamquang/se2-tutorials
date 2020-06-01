package tut09se2.factory;

// Create the CivilService class that extends Course abstract class 
class CivilService extends Course {
	// TO-DO: Implement getDuration() method: set a specific duration and print value
        @Override
	public void getDuration() {
            duration = 10;
            System.out.println("Duration: "+duration+" month.");
	}

	// TO-DO: Implement getFeePerSemester() method: set a specific duration and print value
        @Override
	public void getFeePerSemester() {
            fee = 9;
            System.out.println("fee:" + fee);
	}
}