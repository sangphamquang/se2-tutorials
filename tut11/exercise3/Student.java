package tut11.exercise3;

import com.github.javaparser.ast.expr.ThisExpr;

public class Student extends Human {

	private String falcutyNumber;

	public Student(String firstName, String lastName, String fn) {
		super(firstName, lastName);
		setFalcutyNumber(fn);
		// TODO Auto-generated constructor stub
	}

	public String getFalcutyNumber() {
		return falcutyNumber;
	}

	public void setFalcutyNumber(String falcutyNumber)  throws IllegalArgumentException{
		if(falcutyNumber.length()<5||falcutyNumber.length()>10)throw new IllegalArgumentException("invalid facutyNumver");
		this.falcutyNumber = falcutyNumber;
	}

	@Override
	public String toString() {
		StringBuffer bf = new StringBuffer();
		bf.append("First Name: ").append(this.getFirstName()).append(System.lineSeparator()).append("Last Name: ")
				.append(this.getLastName()).append(System.lineSeparator()).append("Faculty Number:")
				.append(this.getFalcutyNumber()).append(System.lineSeparator());
		return bf.toString();
	}

}
