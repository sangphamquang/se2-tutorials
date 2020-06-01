package tut11.exercise3;

public class Worker extends Human{

	private double weekSalary, hoursPerDay;
	

	public Worker(String firstName, String lastName, double ws, double hd) {
		super(firstName, lastName);
		// TODO Auto-generated constructor stub
		setHoursPerDay(hd);
		setWeekSalary(ws);
	}


	public double getWeekSalary() {
		return weekSalary;
	}

	@Override
	public void setLastName(String lastName) throws IllegalArgumentException {
		if(lastName.length()<3)throw new IllegalArgumentException();
		super.setLastName(lastName);
	}
	
	public void setWeekSalary(double weekSalary)  throws IllegalArgumentException{
		if(weekSalary<10)throw new IllegalArgumentException();
		this.weekSalary = weekSalary;
	}


	public double getHoursPerDay() {
		return hoursPerDay;
	}


	public void setHoursPerDay(double hoursPerDay)  throws IllegalArgumentException{
		if(hoursPerDay<1 || hoursPerDay>12)throw new IllegalArgumentException();
		this.hoursPerDay = hoursPerDay;
	}
	
	@Override
	public String toString() {
		StringBuffer bf = new StringBuffer();
		bf.append("First Name: ").append(this.getFirstName()).append(System.lineSeparator()).append("Last Name: ")
				.append(this.getLastName()).append(System.lineSeparator()).append("WeekSalary: ")
				.append(String.format("%.2f",this.getWeekSalary())).append(System.lineSeparator()).append("Hours per day: ")
				.append(String.format("%.2f",this.getHoursPerDay())).append(System.lineSeparator()).append("Salary per hour: ")
				.append(String.format("%.2f",this.getSalaryPerHour()));
		return bf.toString();
	}


	public double getSalaryPerHour() {
		// TODO Auto-generated method stub
		return this.weekSalary/hoursPerDay/7;
	}

}
