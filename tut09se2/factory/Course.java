package tut09se2.factory;

// Create the abstract class called Course
abstract class Course {
	protected int duration;
	protected double fee;

	// TO-DO: Declare 2 void abstract methods: getDuration(), getFeePerSemester()
        public abstract void getDuration();
        public abstract void getFeePerSemester();
	// TO-DO: Declare void method: calculateTotalFee(). Total = duration * fee

        public double calculateTotalFee(){
            return this.duration*this.fee;
        }
}